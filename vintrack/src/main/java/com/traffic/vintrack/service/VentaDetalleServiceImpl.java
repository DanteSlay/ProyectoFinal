package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudServiceImpl;
import com.traffic.vintrack.model.entity.VentaCliente;
import com.traffic.vintrack.model.entity.VentaDetalle;
import com.traffic.vintrack.repository.VentaDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VentaDetalleServiceImpl extends CrudServiceImpl<VentaDetalle, Long> implements VentaDetalleService {

    @Autowired
    private VentaDetalleRepository repository;

    @Override
    protected JpaRepository<VentaDetalle, Long> getRepository() {
        return repository;
    }

    private Set<VentaDetalle> asignarPrecioVenta(Set<VentaDetalle> detalles) {
        detalles.forEach(detalle -> {
            Double precioVenta = detalle.getVino().getPrecioVenta();
            detalle.setPrecioVenta(precioVenta);
        });
        return detalles;
    }

    @Override
    public Set<VentaDetalle> crearDetalles(Set<VentaDetalle> detalles, VentaCliente venta) {
        detalles.forEach(detalle -> {
            detalle.setVentaCliente(venta);
        });

        detalles = asignarPrecioVenta(detalles);
        detalles = asignarDescuento(detalles);

        return detalles;
    }

    private Set<VentaDetalle> asignarDescuento(Set<VentaDetalle> detalles) {
        detalles.forEach(detalle -> {
            Double descuento = detalle.getVino().getDescuento();
            detalle.setDescuento(descuento);
        });
        return detalles;
    }
}
