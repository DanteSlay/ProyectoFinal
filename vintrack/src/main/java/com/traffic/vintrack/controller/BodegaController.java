package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.BodegaDTO;
import com.traffic.vintrack.model.entity.Bodega;
import com.traffic.vintrack.model.mapper.BodegaMapper;
import com.traffic.vintrack.service.BodegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/getAllPage")
    public ResponseEntity<Page<BodegaDTO>> getAllPage(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ){
        Pageable pageable = PageRequest.of(page, size);
        Page<Bodega> bodegas = service.getAll(pageable);
        Page<BodegaDTO> dtoPage = bodegas.map(mapper::toDTO);

        return new ResponseEntity<>(dtoPage, HttpStatus.OK);
    }
}
