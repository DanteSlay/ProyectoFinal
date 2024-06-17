package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.VentaDetalleDTO;
import com.traffic.vintrack.model.entity.VentaDetalle;
import com.traffic.vintrack.model.mapper.VentaDetalleMapper;
import com.traffic.vintrack.service.VentaDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venta-cliente-detalle")
public class VentaClienteDetalleController extends CrudController<VentaDetalle, VentaDetalleDTO, Long> {
    @Autowired
    private VentaDetalleService service;
    @Autowired
    private VentaDetalleMapper mapper;


    @Override
    protected CrudService<VentaDetalle, Long> getService() {
        return service;
    }

    @Override
    protected Mapper<VentaDetalleDTO, VentaDetalle> getMapper() {
        return mapper;
    }
}
