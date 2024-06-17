package com.traffic.vintrack.service;


import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.entity.Uva;

public interface UvaService extends CrudService<Uva, Long> {
    Uva findByNombre(String nombre);
}
