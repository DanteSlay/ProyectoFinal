package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudServiceImpl;
import com.traffic.vintrack.model.entity.Uva;
import com.traffic.vintrack.repository.UvaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UvaServiceImpl extends CrudServiceImpl<Uva, Long> implements UvaService{

    private final UvaRepository repository;

    @Autowired
    public UvaServiceImpl(UvaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<Uva, Long> getRepository() {
        return repository;
    }

    @Override
    public Uva findByNombre(String nombre) {
        return repository.findByNombre(nombre);
    }
}
