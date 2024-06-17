package com.traffic.vintrack.model.mapper;

import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.exception.NotFoundException;
import com.traffic.vintrack.model.dto.PaisDTO;
import com.traffic.vintrack.model.entity.Pais;
import com.traffic.vintrack.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class PaisMapper implements Mapper<PaisDTO, Pais> {

    @Lazy
    @Autowired
    private PaisService paisService;

    @Override
    public PaisDTO toDTO(Pais pais) {
        if (pais == null) {
            return null;
        }
        return new PaisDTO(pais.getId(), pais.getNombre());
    }

    @Override
    public Pais toEntity(PaisDTO dto) throws NotFoundException {
        if (dto == null) {
            return null;
        }

        Pais pais;
        if (dto.getId() != null && paisService.existById(dto.getId())) {
            pais = paisService.findById(dto.getId());
        }else {
            pais = new Pais();
        }
        pais.setNombre(dto.getNombre());
        return pais;
    }
}

