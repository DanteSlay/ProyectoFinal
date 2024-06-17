package com.traffic.vintrack.model.mapper;

import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.exception.NotFoundException;
import com.traffic.vintrack.model.dto.UvaDTO;
import com.traffic.vintrack.model.entity.Uva;
import com.traffic.vintrack.service.UvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class UvaMapper implements Mapper<UvaDTO, Uva> {

        @Lazy
        @Autowired
        private UvaService uvaService;

        @Override
        public UvaDTO toDTO(Uva uva) {
            if (uva == null) {
                return null;
            }
            return new UvaDTO(uva.getId(), uva.getDescripcion(), uva.getNombre());
        }

        @Override
        public Uva toEntity(UvaDTO uvaDTO) throws NotFoundException {
            if (uvaDTO == null) {
                return null;
            }

            Uva uva;
            if (uvaDTO.getId() != null && uvaService.existById(uvaDTO.getId())) {
                uva = uvaService.findById(uvaDTO.getId());
            }else {
                uva = new Uva();
            }
            uva.setDescripcion(uvaDTO.getDescripcion());
            uva.setNombre(uvaDTO.getNombre());
            return uva;
        }
    }

