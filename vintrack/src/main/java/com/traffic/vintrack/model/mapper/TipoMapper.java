package com.traffic.vintrack.model.mapper;

import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.exception.NotFoundException;
import com.traffic.vintrack.model.dto.TipoDTO;
import com.traffic.vintrack.model.entity.Tipo;
import com.traffic.vintrack.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TipoMapper implements Mapper<TipoDTO, Tipo> {

    @Lazy
    @Autowired
    private TipoService tipoService;

    @Override
    public TipoDTO toDTO(Tipo tipo) {
        if (tipo == null) {
            return null;
        }
        return new TipoDTO(tipo.getId(), tipo.getNombre());
    }

    @Override
    public Tipo toEntity(TipoDTO tipoDTO) throws NotFoundException {
        if (tipoDTO == null) {
            return null;
        }

        Tipo tipo;
        if (tipoDTO.getId() != null && tipoService.existById(tipoDTO.getId())) {
            tipo = tipoService.findById(tipoDTO.getId());
        } else {
            tipo = new Tipo();
        }
        tipo.setNombre(tipoDTO.getNombre());
        return tipo;
    }
}
