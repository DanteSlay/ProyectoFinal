package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.base.service.PageService;
import com.traffic.vintrack.model.dto.VinoSearchDTO;
import com.traffic.vintrack.model.entity.Vino;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VinoService extends CrudService<Vino, Long>, PageService<Vino> {
    void añadirCantidad(final Vino vino, final Integer cantidad);

    Page<Vino> searchVinos(VinoSearchDTO vinoSearchDTO, Pageable pageable);
    void restarCantidad(final Vino vino, Integer cantidad);
}
