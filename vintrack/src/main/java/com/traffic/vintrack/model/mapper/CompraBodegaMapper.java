package com.traffic.vintrack.model.mapper;

import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.exception.NotFoundException;
import com.traffic.vintrack.model.dto.CompraBodegaDTO;
import com.traffic.vintrack.model.entity.CompraBodega;
import com.traffic.vintrack.service.BodegaService;
import com.traffic.vintrack.service.CompraBodegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CompraBodegaMapper implements Mapper<CompraBodegaDTO, CompraBodega> {
    @Autowired
    @Lazy
    private CompraBodegaService service;

    @Lazy
    @Autowired
    private BodegaService bodegaService;

    @Lazy
    @Autowired
    private CompraDetalleMapper detalleMapper;

    @Override
    public CompraBodegaDTO toDTO(CompraBodega compraBodega) {
        if (compraBodega == null) return null;

        return new CompraBodegaDTO.Builder()
                .id(compraBodega.getId())
                .fecha(compraBodega.getFecha())
                .total(compraBodega.getTotal())
                .rutaPDF(compraBodega.getRutaPDF())
                .bodega_id(compraBodega.getBodega().getId())
                .detalles(compraBodega.getDetalles()
                        .stream()
                        .map(detalleMapper::toDTO)
                        .collect(Collectors.toSet()))
                .build();
    }

    @Override
    public CompraBodega toEntity(CompraBodegaDTO compraBodegaDTO) throws NotFoundException {
        if (compraBodegaDTO == null) return null;

        CompraBodega compraBodega;
        if (compraBodegaDTO.getId() != null && service.existById(compraBodegaDTO.getId())){
            compraBodega = service.findById(compraBodegaDTO.getId());
        } else {
            compraBodega = new CompraBodega();
        }
        compraBodega.setFecha(compraBodegaDTO.getFecha());
        compraBodega.setRutaPDF(compraBodegaDTO.getRutaPDF());
        compraBodega.setBodega(bodegaService.findById(compraBodegaDTO.getBodega_id()));
        compraBodega.setDetalles(compraBodegaDTO.getDetalles().stream()
                .map(detalle -> {
                    try {
                        return detalleMapper.toEntity(detalle);
                    } catch (NotFoundException e) {
                        return null;
                    }
                })
                .collect(Collectors.toSet()));

        return compraBodega;
    }

}

