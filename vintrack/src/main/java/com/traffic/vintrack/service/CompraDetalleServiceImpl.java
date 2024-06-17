package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudServiceImpl;
import com.traffic.vintrack.model.entity.CompraDetalle;
import com.traffic.vintrack.repository.CompraDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CompraDetalleServiceImpl extends CrudServiceImpl<CompraDetalle, Long> implements CompraDetalleService{
    private final CompraDetalleRepository repository;

    @Autowired
    public CompraDetalleServiceImpl(CompraDetalleRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<CompraDetalle, Long> getRepository() {
        return repository;
    }


    @Override
    public Set<CompraDetalle> findAllById(Set<Long> ids) {
        return new HashSet<>(repository.findAllById(ids));
    }

    public Set<CompraDetalle> asignarPrecioUnitario(Set<CompraDetalle> detalles){
        detalles.forEach(detalle -> {
            Double precioUnitario =  detalle.getVino().getPrecioCosto();
            detalle.setPrecio_unitario(precioUnitario);
        });

        return detalles;
    }

}
