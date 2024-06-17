package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudServiceImpl;
import com.traffic.vintrack.model.entity.Empleado;
import com.traffic.vintrack.repository.EmpleadoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl extends CrudServiceImpl<Empleado, Long> implements EmpleadoService {

    private final EmpleadoRepository repository;

    public EmpleadoServiceImpl(EmpleadoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Empleado findByUsername(final String username) {
        return repository.findByUsername(username);
    }

    @Override
    public boolean existsByUsername(final String username) {
        return repository.existsByUsername(username);
    }

    @Override
    protected JpaRepository<Empleado, Long> getRepository() {
        return repository;
    }
}
