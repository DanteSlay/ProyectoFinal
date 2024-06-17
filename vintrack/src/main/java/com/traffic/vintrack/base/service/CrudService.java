package com.traffic.vintrack.base.service;

import com.traffic.vintrack.exception.NotFoundException;

import java.util.Set;

public interface CrudService<Entity, ID>{
    Entity findById(ID id) throws NotFoundException;
    Set<Entity> findAll() throws NotFoundException;
    Entity save(Entity entity);

    void delete(ID id) throws NotFoundException;

    boolean existById(ID id);
}
