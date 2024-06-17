package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudServiceImpl;
import com.traffic.vintrack.model.entity.Rol;
import com.traffic.vintrack.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RolServiceImpl extends CrudServiceImpl<Rol, Long> implements RolService {

    private final RolRepository repository;

    @Autowired
    public RolServiceImpl(RolRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<Rol, Long> getRepository() {
        return repository;
    }

    @Override
    public boolean existByNombre(final String nombre) {
        return repository.existsByNombre(nombre);
    }

    @Override
    public Rol findByNombre(final String nombre) {
        return repository.findByNombre(nombre);
    }
}
