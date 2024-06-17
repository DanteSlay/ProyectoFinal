package com.traffic.vintrack.service;


import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.entity.Pais;

public interface PaisService extends CrudService<Pais, Long> {
    Pais findByNombre(String nombrePais);
}
