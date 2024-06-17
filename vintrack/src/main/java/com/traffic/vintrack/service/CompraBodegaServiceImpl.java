package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudServiceImpl;
import com.traffic.vintrack.model.entity.CompraBodega;
import com.traffic.vintrack.model.entity.CompraDetalle;
import com.traffic.vintrack.model.entity.Vino;
import com.traffic.vintrack.repository.CompraBodegaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class CompraBodegaServiceImpl extends CrudServiceImpl<CompraBodega, Long> implements CompraBodegaService {
    private final CompraBodegaRepository repository;
    private final CompraDetalleService detalleService;

    private final VinoService vinoService;

    @Autowired
    public CompraBodegaServiceImpl(CompraBodegaRepository repository, VinoService vinoService, CompraDetalleService detalleService) {
        this.repository = repository;
        this.detalleService = detalleService;
        this.vinoService = vinoService;
    }

    @Override
    protected JpaRepository<CompraBodega, Long> getRepository() {
        return repository;
    }

    @Override
    @Transactional
    public CompraBodega save(CompraBodega compraBodega) {
        compraBodega.getDetalles().forEach(detalle -> detalle.setCompraBodega(compraBodega));

        Set<CompraDetalle> detalles = detalleService.asignarPrecioUnitario(compraBodega.getDetalles());
        compraBodega.setDetalles(detalles);

        compraBodega.setTotal(calcularTotalCompra(detalles));

        CompraBodega saved =  super.save(compraBodega);

        añadirCantidadVino(detalles);

        return saved;
    }

    private Double calcularTotalCompra(final Set<CompraDetalle> detalles){
        return detalles.stream()
                .mapToDouble(detalle -> detalle.getCantidad() * detalle.getPrecio_unitario())
                .sum();
    }


    private void añadirCantidadVino(final Set<CompraDetalle> detalles){
        detalles.forEach(detalle -> {
            Vino vino = detalle.getVino();
            vinoService.añadirCantidad(vino, detalle.getCantidad());
        });
    }
}
