package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.VinoCardDTO;
import com.traffic.vintrack.model.entity.Vino;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VinoService extends CrudService<Vino, Long> {
    Page<VinoCardDTO> findAll(Pageable pageable);
    void añadirCantidad(final Vino vino, final Integer cantidad);

    void restarCantidad(final Vino vino, Integer cantidad);
}
