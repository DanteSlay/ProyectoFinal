package com.traffic.vintrack.model.mapper;

import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.exception.NotFoundException;
import com.traffic.vintrack.model.dto.CrianzaDTO;
import com.traffic.vintrack.model.entity.Crianza;
import com.traffic.vintrack.service.CrianzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CrianzaMapper implements Mapper<CrianzaDTO, Crianza> {
    @Lazy
    @Autowired
    private CrianzaService service;

    @Override
    public CrianzaDTO toDTO(Crianza crianza) {
        if (crianza == null) return null;

        return new CrianzaDTO(crianza.getId(), crianza.getNombre());
    }

    @Override
    public Crianza toEntity(CrianzaDTO dto) throws NotFoundException {
        if (dto == null) return null;

        Crianza entity;
        if (dto.getId() != null && service.existById(dto.getId())) {
            entity = service.findById(dto.getId());
        }else {
            entity = new Crianza();
        }
        entity.setNombre(dto.getNombre());
        return entity;
    }
}
