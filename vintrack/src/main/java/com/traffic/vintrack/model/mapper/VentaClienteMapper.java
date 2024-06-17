package com.traffic.vintrack.model.mapper;

import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.exception.NotFoundException;
import com.traffic.vintrack.model.dto.VentaClienteDTO;
import com.traffic.vintrack.model.entity.VentaCliente;
import com.traffic.vintrack.service.ClienteService;
import com.traffic.vintrack.service.EmpleadoService;
import com.traffic.vintrack.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class VentaClienteMapper implements Mapper<VentaClienteDTO, VentaCliente> {
    @Autowired
    @Lazy
    private VentaService service;

    @Autowired
    @Lazy
    private VentaDetalleMapper mapperDetalle;

    @Autowired
    @Lazy
    private ClienteService clienteService;

    @Autowired
    @Lazy
    private EmpleadoService empleadoService;

    @Override
    public VentaClienteDTO toDTO(final VentaCliente entity) {
        if(entity == null) return null;

        return new VentaClienteDTO.Builder()
                .id(entity.getId())
                .fecha(entity.getFecha())
                .total(entity.getTotal())
                .rutaPDF(entity.getRutaPDF())
                .empleado(entity.getEmpleado().getUsername())
                .cliente(entity.getCliente().getId())
                .detalles(entity.getDetalles().stream()
                        .map(mapperDetalle::toDTO)
                        .collect(Collectors.toSet()))
                .build();
    }

    @Override
    public VentaCliente toEntity(final VentaClienteDTO dto) throws NotFoundException {
        if (dto == null) return null;

        VentaCliente entity;
        if (dto.getId() == null && service.existById(dto.getId())){
            entity = service.findById(dto.getId());
        }else {
            entity = new VentaCliente();
        }

        entity.setFecha(dto.getFecha());
        entity.setRutaPDF(dto.getRutaPDF());
        entity.setCliente(clienteService.findById(dto.getCliente()));
        entity.setEmpleado(empleadoService.findByUsername(dto.getEmpleado()));
        entity.setDetalles(dto.getDetalles().stream()
                .map(detalle -> {
                    try{
                        return mapperDetalle.toEntity(detalle);
                    }catch (NotFoundException e){
                        return null;
                    }
                })
                .collect(Collectors.toSet()));
        return entity;
    }
}
