package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.VentaClienteDTO;
import com.traffic.vintrack.model.entity.VentaCliente;
import com.traffic.vintrack.model.mapper.VentaClienteMapper;
import com.traffic.vintrack.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venta-cliente")
public class VentaClienteController extends CrudController<VentaCliente, VentaClienteDTO, Long> {
    @Autowired
    private VentaService service;
    @Autowired
    private VentaClienteMapper mapper;
    @Override
    protected CrudService<VentaCliente, Long> getService() {
        return service;
    }

    @Override
    protected Mapper<VentaClienteDTO, VentaCliente> getMapper() {
        return mapper;
    }
}
