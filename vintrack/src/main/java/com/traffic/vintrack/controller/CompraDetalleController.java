package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.CompraDetalleDTO;
import com.traffic.vintrack.model.entity.CompraDetalle;
import com.traffic.vintrack.model.mapper.CompraDetalleMapper;
import com.traffic.vintrack.service.CompraDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra-bodega-detalle")
public class CompraDetalleController extends CrudController<CompraDetalle, CompraDetalleDTO, Long> {
    @Autowired
    private CompraDetalleService service;
    @Autowired
    private CompraDetalleMapper mapper;

    @Override
    protected CrudService<CompraDetalle, Long> getService() {
        return service;
    }

    @Override
    protected Mapper<CompraDetalleDTO, CompraDetalle> getMapper() {
        return mapper;
    }
}
