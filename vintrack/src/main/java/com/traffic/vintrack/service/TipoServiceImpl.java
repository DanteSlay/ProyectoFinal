package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudServiceImpl;
import com.traffic.vintrack.model.entity.Tipo;
import com.traffic.vintrack.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class TipoServiceImpl extends CrudServiceImpl<Tipo, Long> implements TipoService {

    private final TipoRepository repository;

    @Autowired
    public TipoServiceImpl(TipoRepository repository) {
        this.repository = repository;
    }
    @Override
    protected JpaRepository<Tipo, Long> getRepository() {
        return repository;
    }

    @Override
    public Tipo findByNombre(String nombre) {
        return repository.findByNombre(nombre);
    }
}
