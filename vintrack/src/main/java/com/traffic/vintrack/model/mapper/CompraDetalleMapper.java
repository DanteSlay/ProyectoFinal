package com.traffic.vintrack.model.mapper;

import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.exception.NotFoundException;
import com.traffic.vintrack.model.dto.CompraDetalleDTO;
import com.traffic.vintrack.model.entity.CompraDetalle;
import com.traffic.vintrack.model.entity.Vino;
import com.traffic.vintrack.service.VinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CompraDetalleMapper implements Mapper<CompraDetalleDTO, CompraDetalle> {
    @Lazy
    @Autowired
    private VinoService vinoService;

    @Override
    public CompraDetalleDTO toDTO(CompraDetalle compraDetalle) {
        if (compraDetalle == null) return null;
        return new CompraDetalleDTO(compraDetalle.getVino().getId(), compraDetalle.getCantidad(), compraDetalle.getPrecio_unitario());
    }

    @Override
    public CompraDetalle toEntity(CompraDetalleDTO dto) throws NotFoundException {
        if (dto == null) return null;

        CompraDetalle entity = new CompraDetalle();
        entity.setCantidad(dto.getCantidad());

        Vino vino;
        vino = vinoService.findById(dto.getVino_id());
        entity.setVino(vino);
        entity.setPrecio_unitario(dto.getPrecio_unitario());

        return entity;
    }
}

