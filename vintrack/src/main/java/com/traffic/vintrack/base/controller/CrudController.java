package com.traffic.vintrack.base.controller;

import com.traffic.vintrack.exception.NotFoundException;
import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.base.service.CrudService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

public abstract class CrudController<Entity, DTO, ID> {
    protected abstract CrudService<Entity, ID> getService();
    protected abstract Mapper<DTO, Entity> getMapper();

    @PostMapping
    public ResponseEntity<DTO> create(@Valid @RequestBody DTO dto) throws NotFoundException {
        if (dto == null) throw new NotFoundException("El recurso es nulo");

        Entity newEntity = getMapper().toEntity(dto);
        DTO savedDTO = getMapper().toDTO(getService().save(newEntity));
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DTO> getById(@PathVariable ID id) throws NotFoundException {
        DTO dto = getMapper().toDTO(getService().findById(id));
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/all")
    public ResponseEntity<Set<DTO>> getAll() throws NotFoundException {
        Set<DTO> dtos = getService().findAll().stream().map(getMapper()::toDTO).collect(Collectors.toSet());
        return ResponseEntity.ok(dtos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ID id) throws NotFoundException {
        getService().delete(id);
        return ResponseEntity.ok().build();
    }
}
