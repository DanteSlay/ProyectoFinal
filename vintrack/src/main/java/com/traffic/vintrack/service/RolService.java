package com.traffic.vintrack.service;


import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.entity.Rol;

public interface RolService extends CrudService<Rol, Long> {
    boolean existByNombre(String nombre);
    Rol findByNombre(String nombre);
}
