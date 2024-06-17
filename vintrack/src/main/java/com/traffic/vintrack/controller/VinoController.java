package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.VinoDTO;
import com.traffic.vintrack.model.entity.Vino;
import com.traffic.vintrack.model.mapper.VinoMapper;
import com.traffic.vintrack.service.VinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vino")
public class VinoController extends CrudController<Vino, VinoDTO, Long> {
    @Autowired
    private VinoService service;

    @Autowired
    private VinoMapper mapper;

    @Override
    protected CrudService<Vino, Long> getService() {
        return service;
    }

    @Override
    protected Mapper<VinoDTO, Vino> getMapper() {
        return mapper;
    }
}
