package com.traffic.vintrack.model.mapper;

import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.exception.NotFoundException;
import com.traffic.vintrack.model.dto.EmpleadoDTO;
import com.traffic.vintrack.model.entity.Empleado;
import com.traffic.vintrack.model.entity.Rol;
import com.traffic.vintrack.service.EmpleadoService;
import com.traffic.vintrack.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class EmpleadoMapper implements Mapper<EmpleadoDTO, Empleado> {
    @Lazy
    @Autowired
    private EmpleadoService service;

    @Lazy
    @Autowired
    private RolService rolService;

    @Override
    public EmpleadoDTO toDTO(Empleado empleado) {
        if (empleado == null) return null;
        return new EmpleadoDTO.Builder()
                .nombre(empleado.getNombre())
                .apellido(empleado.getApellido())
                .email(empleado.getEmail())
                .username(empleado.getUsername())
                .fechaNacimiento(empleado.getFechaNacimiento())
                .roles(empleado.getRoles().stream()
                        .map(Rol::getNombre)
                        .collect(Collectors.toSet()))
                .build();
    }

    @Override

    public Empleado toEntity(EmpleadoDTO empleadoDTO) throws NotFoundException {
        if (empleadoDTO == null) return null;

        String username = empleadoDTO.getUsername();
        Empleado.Builder builder = new Empleado.Builder(empleadoDTO.getNombre(), empleadoDTO.getApellido())
                .email(empleadoDTO.getEmail())
                .roles(empleadoDTO.getRoles().stream()
                        .map(rolNombre -> rolService.findByNombre(rolNombre))
                        .filter(Objects::nonNull)
                        .collect(Collectors.toSet()));

        if (username != null && !username.isEmpty() && service.existsByUsername(username)) {
            Empleado existingEmpleado = service.findByUsername(username);
            builder.password(existingEmpleado.getPassword())
                    .fechaNacimiento(existingEmpleado.getFechaNacimiento());
        } else {
            builder.fechaNacimiento(empleadoDTO.getFechaNacimiento());
        }

        return builder.build();
    }
}
