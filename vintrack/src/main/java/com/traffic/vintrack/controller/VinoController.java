package com.traffic.vintrack.controller;

import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.VinoCardDTO;
import com.traffic.vintrack.model.dto.VinoDTO;
import com.traffic.vintrack.model.entity.Vino;
import com.traffic.vintrack.model.mapper.VinoMapper;
import com.traffic.vintrack.service.VinoService;
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

    @GetMapping("/getAllPage")
    public ResponseEntity<Page<VinoCardDTO>> getAllVinos(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ){
        Pageable pageable = PageRequest.of(page, size);
        Page<Vino> vinos = service.getAll(pageable);
        Page<VinoCardDTO> vinoCardDTOPage = vinos.map(vino -> mapper.toDTO(vino).toCardDTO());

        return new ResponseEntity<>(vinoCardDTOPage, HttpStatus.OK);
    }
}
