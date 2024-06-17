package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudServiceImpl;
import com.traffic.vintrack.model.entity.VentaCliente;
import com.traffic.vintrack.model.entity.VentaDetalle;
import com.traffic.vintrack.model.entity.Vino;
import com.traffic.vintrack.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VentaServiceImpl extends CrudServiceImpl<VentaCliente, Long> implements VentaService {

    private final VentaRepository repository;
    private final VentaDetalleService detalleService;

    private final VinoService vinoService;
    @Autowired
    public VentaServiceImpl(VentaRepository repository, VinoService vinoService, VentaDetalleService detalleService) {
        this.repository = repository;
        this.detalleService = detalleService;
        this.vinoService = vinoService;
    }

    @Override
    protected JpaRepository<VentaCliente, Long> getRepository() {
        return repository;
    }

    @Override
    public VentaCliente save(VentaCliente ventaCliente) {

        Set<VentaDetalle> detalles = detalleService.crearDetalles(ventaCliente.getDetalles(), ventaCliente);
        ventaCliente.setDetalles(detalles);

        ventaCliente.setTotal(calcularTotalVenta(detalles));

        restarCantidadVino(detalles);
        return super.save(ventaCliente);
    }

    private Double calcularTotalVenta(final Set<VentaDetalle> detalles) {
        return detalles.stream()
                .mapToDouble(detalle -> detalle.getCantidad() * detalle.getPrecioVenta() * (1 - detalle.getDescuento() / 100.0))
                .sum();
    }

    private void restarCantidadVino(final Set<VentaDetalle> detalles) {
        detalles.forEach(detalle -> {
            Vino vino = detalle.getVino();
            vinoService.restarCantidad(vino, detalle.getCantidad());
        });
    }
}
