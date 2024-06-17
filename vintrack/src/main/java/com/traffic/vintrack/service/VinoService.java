package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.base.service.PageService;
import com.traffic.vintrack.model.entity.Vino;

public interface VinoService extends CrudService<Vino, Long>, PageService<Vino> {
    void añadirCantidad(final Vino vino, final Integer cantidad);

    void restarCantidad(final Vino vino, Integer cantidad);
}
