package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.entity.Tipo;

public interface TipoService extends CrudService<Tipo, Long> {
    Tipo findByNombre(String nombre);
}
