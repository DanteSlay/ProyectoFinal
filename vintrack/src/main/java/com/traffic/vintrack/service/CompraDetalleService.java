package com.traffic.vintrack.service;


import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.entity.CompraDetalle;

import java.util.Set;

public interface CompraDetalleService extends CrudService<CompraDetalle, Long> {
    Set<CompraDetalle> findAllById(Set<Long> ids);

    Set<CompraDetalle> asignarPrecioUnitario(Set<CompraDetalle> detalles);
}
