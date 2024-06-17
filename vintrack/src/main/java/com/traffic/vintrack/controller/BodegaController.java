package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.BodegaDTO;
import com.traffic.vintrack.model.entity.Bodega;
import com.traffic.vintrack.model.mapper.BodegaMapper;
import com.traffic.vintrack.service.BodegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bodega")
public class BodegaController extends CrudController<Bodega, BodegaDTO, Long> {

    @Autowired
    private BodegaService service;

    @Autowired
    private BodegaMapper mapper;

    @Override
    protected CrudService<Bodega, Long> getService() {
        return service;
    }

    @Override
    protected Mapper<BodegaDTO, Bodega> getMapper() {
        return mapper;
    }

}
