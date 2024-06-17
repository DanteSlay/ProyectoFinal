package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.CompraBodegaDTO;
import com.traffic.vintrack.model.entity.CompraBodega;
import com.traffic.vintrack.model.mapper.CompraBodegaMapper;
import com.traffic.vintrack.service.CompraBodegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra-bodega")
public class CompraBodegaController extends CrudController<CompraBodega, CompraBodegaDTO, Long> {

    @Autowired
    private CompraBodegaService service;

    @Autowired
    private CompraBodegaMapper mapper;

    @Override
    protected CrudService<CompraBodega, Long> getService() {
        return service;
    }

    @Override
    protected Mapper<CompraBodegaDTO, CompraBodega> getMapper() {
        return mapper;
    }
}
