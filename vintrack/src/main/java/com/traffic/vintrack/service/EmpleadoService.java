package com.traffic.vintrack.service;


import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.entity.Empleado;

public interface EmpleadoService extends CrudService<Empleado, Long> {
    Empleado findByUsername(String username);

    boolean existsByUsername(String username);
}
