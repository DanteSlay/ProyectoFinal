package com.traffic.vintrack.service;

import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.entity.VentaCliente;
import com.traffic.vintrack.model.entity.VentaDetalle;

import java.util.Set;

public interface VentaDetalleService extends CrudService<VentaDetalle, Long> {

    Set<VentaDetalle> crearDetalles(final Set<VentaDetalle> detalles, VentaCliente venta);
}
