package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudServiceImpl;
import com.traffic.vintrack.model.entity.Pais;
import com.traffic.vintrack.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PaisServiceImpl extends CrudServiceImpl<Pais, Long> implements PaisService {
    private final PaisRepository repository;

    @Autowired
    public PaisServiceImpl(PaisRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<Pais, Long> getRepository() {
        return repository;
    }

    @Override
    @Transactional(readOnly = true)
    public Pais findByNombre(String nombrePais) {
        return repository.findByNombre(nombrePais);
    }
}
