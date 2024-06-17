package com.traffic.vintrack.model.mapper;

import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.model.dto.ClienteDTO;
import com.traffic.vintrack.model.entity.Cliente;

import org.springframework.stereotype.Component;

@Component
public class ClienteMapper implements Mapper<ClienteDTO, Cliente> {
    @Override
    public ClienteDTO toDTO(Cliente entity) {
        return new ClienteDTO.Builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .apellido(entity.getApellido())
                .email(entity.getEmail())
                .telefono(entity.getTelefono())
                .build();
    }

    @Override
    public Cliente toEntity(ClienteDTO dto) {
        return new Cliente.Builder()
                .id(dto.getId())
                .nombre(dto.getNombre())
                .apellido(dto.getApellido())
                .email(dto.getEmail())
                .telefono(dto.getTelefono())
                .build();
    }
}
