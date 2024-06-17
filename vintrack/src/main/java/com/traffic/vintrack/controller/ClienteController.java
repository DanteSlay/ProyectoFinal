package com.traffic.vintrack.controller;


import com.traffic.vintrack.base.controller.CrudController;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.dto.ClienteDTO;
import com.traffic.vintrack.model.entity.Cliente;
import com.traffic.vintrack.model.mapper.ClienteMapper;
import com.traffic.vintrack.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends CrudController<Cliente, ClienteDTO, Long> {
    @Autowired
    private ClienteService service;
    @Autowired
    private ClienteMapper mapper;

    @Override
    protected CrudService<Cliente, Long> getService() {
        return service;
    }

    @Override
    protected Mapper<ClienteDTO, Cliente> getMapper() {
        return mapper;
    }
}
