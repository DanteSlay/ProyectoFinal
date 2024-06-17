package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudAndPageServiceImpl;
import com.traffic.vintrack.base.service.CrudServiceImpl;
import com.traffic.vintrack.model.entity.Bodega;
import com.traffic.vintrack.repository.BodegaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BodegaServiceImpl extends CrudAndPageServiceImpl<Bodega, Long> implements BodegaService {

    private final BodegaRepository repository;

    @Autowired
    public BodegaServiceImpl(BodegaRepository repository) {
        this.repository = repository;
    }


    @Override
    protected JpaRepository<Bodega, Long> getRepository() {
        return repository;
    }
}
