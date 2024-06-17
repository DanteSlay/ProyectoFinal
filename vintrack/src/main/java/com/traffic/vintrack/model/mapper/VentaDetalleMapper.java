package com.traffic.vintrack.model.mapper;

import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.exception.NotFoundException;
import com.traffic.vintrack.model.dto.VentaDetalleDTO;
import com.traffic.vintrack.model.entity.VentaDetalle;
import com.traffic.vintrack.service.VinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class VentaDetalleMapper implements Mapper<VentaDetalleDTO, VentaDetalle> {

    @Autowired
    @Lazy
    private VinoService vinoService;

    @Override
    public VentaDetalleDTO toDTO(VentaDetalle entity) {
        if (entity == null) {
            return null;
        }

        return new VentaDetalleDTO.Builder()
                .vino(entity.getVino().getId())
                .cantidad(entity.getCantidad())
                .precio(entity.getPrecioVenta())
                .build();
    }

    @Override
    public VentaDetalle toEntity(VentaDetalleDTO dto) throws NotFoundException {
        if (dto == null) {
            return null;
        }

        VentaDetalle entity = new VentaDetalle();
        entity.setVino(vinoService.findById(dto.getVino_id()));
        entity.setCantidad(dto.getCantidad());
        return entity;
    }
}
