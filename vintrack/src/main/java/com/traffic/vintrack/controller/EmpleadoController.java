package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.EmpleadoDTO;
import com.traffic.vintrack.model.entity.Empleado;
import com.traffic.vintrack.model.mapper.EmpleadoMapper;
import com.traffic.vintrack.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController extends CrudController<Empleado, EmpleadoDTO, Long> {
    @Autowired
    private EmpleadoMapper mapper;

    @Autowired
    private EmpleadoService service;


    @Override
    protected CrudService<Empleado, Long> getService() {
        return service;
    }

    @Override
    protected Mapper<EmpleadoDTO, Empleado> getMapper() {
        return mapper;
    }
}
