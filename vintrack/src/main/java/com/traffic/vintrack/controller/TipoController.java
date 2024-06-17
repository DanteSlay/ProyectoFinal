package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.TipoDTO;
import com.traffic.vintrack.model.entity.Tipo;
import com.traffic.vintrack.model.mapper.TipoMapper;
import com.traffic.vintrack.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipo-vino")
public class TipoController extends CrudController<Tipo, TipoDTO, Long> {
    @Autowired
    private TipoService service;
    @Autowired
    private TipoMapper mapper;

    @Override
    protected CrudService<Tipo, Long> getService() {
        return service;
    }

    @Override
    protected Mapper<TipoDTO, Tipo> getMapper() {
        return mapper;
    }
}
