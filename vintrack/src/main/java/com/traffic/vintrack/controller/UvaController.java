package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.UvaDTO;
import com.traffic.vintrack.model.entity.Uva;
import com.traffic.vintrack.model.mapper.UvaMapper;
import com.traffic.vintrack.service.UvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uva")
public class UvaController extends CrudController<Uva, UvaDTO, Long> {
    @Autowired
    private UvaService service;

    @Autowired
    private UvaMapper mapper;

    @Override
    protected CrudService<Uva, Long> getService() {
        return service;
    }

    @Override
    protected Mapper<UvaDTO, Uva> getMapper() {
        return mapper;
    }
}
