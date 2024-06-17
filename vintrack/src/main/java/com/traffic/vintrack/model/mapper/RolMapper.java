package com.traffic.vintrack.model.mapper;

import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.exception.NotFoundException;
import com.traffic.vintrack.model.dto.RolDTO;
import com.traffic.vintrack.model.entity.Rol;
import com.traffic.vintrack.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class RolMapper implements Mapper<RolDTO, Rol> {

    @Lazy
    @Autowired
    private RolService service;

    @Override
    public RolDTO toDTO(Rol rol) {
        if(rol == null) return null;
        return new RolDTO(rol.getNombre(), rol.getDescripcion());
    }

    @Override
    public Rol toEntity(RolDTO rolDTO) throws NotFoundException {
        if(rolDTO == null) return null;

        Rol entity;
        String nombre = rolDTO.getNombre();
        if(nombre != null && !nombre.isEmpty() && service.existByNombre(nombre)){
            entity = service.findByNombre(nombre);
        }else {
            entity = new Rol();
        }

        entity.setNombre(nombre);
        entity.setDescripcion(rolDTO.getDescripcion());

        return entity;
    }
}
