package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudServiceImpl;
import com.traffic.vintrack.model.entity.Cliente;
import com.traffic.vintrack.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends CrudServiceImpl<Cliente, Long> implements ClienteService {

    private final ClienteRepository repository;

    @Autowired
    public ClienteServiceImpl(ClienteRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<Cliente, Long> getRepository() {
        return repository;
    }

}
