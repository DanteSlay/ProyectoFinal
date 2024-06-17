package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.RolDTO;
import com.traffic.vintrack.model.entity.Rol;
import com.traffic.vintrack.model.mapper.RolMapper;
import com.traffic.vintrack.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rol")
public class RolController extends CrudController<Rol, RolDTO, Long> {

    @Autowired
    private RolService service;

    @Autowired
    private RolMapper mapper;

    @Override
    protected CrudService<Rol, Long> getService() {
        return service;
    }

    @Override
    protected Mapper<RolDTO, Rol> getMapper() {
        return mapper;
    }
}
