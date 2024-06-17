package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudServiceImpl;
import com.traffic.vintrack.model.entity.Crianza;
import com.traffic.vintrack.repository.CrianzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CrianzaServiceImpl extends CrudServiceImpl<Crianza, Long> implements CrianzaService {

    private final CrianzaRepository repository;

    @Autowired
    public CrianzaServiceImpl(CrianzaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<Crianza, Long> getRepository() {
        return repository;
    }

    @Override
    public Crianza findByNombre(String nombre) {
        return repository.findByNombre(nombre);
    }
}
