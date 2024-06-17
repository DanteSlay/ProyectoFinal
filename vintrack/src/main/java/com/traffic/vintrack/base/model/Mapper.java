package com.traffic.vintrack.base.model;

import com.traffic.vintrack.exception.NotFoundException;

public interface Mapper<DTO, Entity> {
    DTO toDTO(Entity entity);
    Entity toEntity(DTO dto) throws NotFoundException;
}
