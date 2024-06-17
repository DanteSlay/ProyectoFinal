package com.traffic.vintrack.model.mapper;

import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.exception.NotFoundException;
import com.traffic.vintrack.model.dto.BodegaDTO;
import com.traffic.vintrack.model.entity.Bodega;
import com.traffic.vintrack.service.BodegaService;
import com.traffic.vintrack.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
public class BodegaMapper implements Mapper<BodegaDTO, Bodega> {

    @Autowired
    @Lazy
    private BodegaService service;

    @Autowired
    @Lazy
    private PaisService paisService;

    @Override
    public BodegaDTO toDTO(Bodega bodega) {
        if(bodega == null){
            return null;
        }
        return new BodegaDTO.Builder()
                .id(bodega.getId())
                .nombre(bodega.getNombre())
                .web(bodega.getWeb())
                .direccion(bodega.getDireccion())
                .email(bodega.getEmail())
                .telefono(bodega.getTelefono())
                .pais(bodega.getPais().getNombre())
                .build();
    }

    @Override
    public Bodega toEntity(BodegaDTO bodegaDTO) throws NotFoundException {
        if (bodegaDTO == null) {
            return null;
        }

        Bodega bodega;
        if (bodegaDTO.getId() != null && service.existById(bodegaDTO.getId())) {
            bodega = service.findById(bodegaDTO.getId());
        } else {
            bodega = new Bodega();
        }
        bodega.setNombre(bodegaDTO.getNombre());
        bodega.setWeb(bodegaDTO.getWeb());
        bodega.setDireccion(bodegaDTO.getDireccion());
        bodega.setEmail(bodegaDTO.getEmail());
        bodega.setTelefono(bodegaDTO.getTelefono());
        bodega.setPais(paisService.findByNombre(bodegaDTO.getNombrePais()));
        return bodega;
    }
}
