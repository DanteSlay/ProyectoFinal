package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.PaisDTO;
import com.traffic.vintrack.model.entity.Pais;
import com.traffic.vintrack.model.mapper.PaisMapper;
import com.traffic.vintrack.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pais")
public class PaisController extends CrudController<Pais, PaisDTO, Long> {

    @Autowired
    private PaisService service;

    @Autowired
    private PaisMapper mapper;

    @Override
    protected CrudService<Pais, Long> getService() {
        return service;
    }

    @Override
    protected Mapper<PaisDTO, Pais> getMapper() {
        return mapper;
    }

}
