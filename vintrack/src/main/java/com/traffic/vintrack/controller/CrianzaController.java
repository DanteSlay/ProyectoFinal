package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.CrianzaDTO;
import com.traffic.vintrack.model.entity.Crianza;
import com.traffic.vintrack.model.mapper.CrianzaMapper;
import com.traffic.vintrack.service.CrianzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crianza")
public class CrianzaController extends CrudController<Crianza, CrianzaDTO, Long> {

    @Autowired
    private CrianzaService service;

    @Autowired
    private CrianzaMapper mapper;

    @Override
    protected CrudService<Crianza, Long> getService() {
        return service;
    }

    @Override
    protected Mapper<CrianzaDTO, Crianza> getMapper() {
        return mapper;
    }
}
