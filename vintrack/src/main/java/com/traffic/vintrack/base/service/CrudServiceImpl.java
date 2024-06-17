package com.traffic.vintrack.base.service;

import com.traffic.vintrack.exception.DatabaseException;
import com.traffic.vintrack.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public abstract class CrudServiceImpl<Entity, ID> {

    private static final Logger logger = LoggerFactory.getLogger(CrudServiceImpl.class);

    protected abstract JpaRepository<Entity, ID> getRepository();

    @Transactional(readOnly = true)
    public Entity findById(ID id) throws NotFoundException {
        Optional<Entity> entity = getRepository().findById(id);
        if (entity.isPresent()) {
            return entity.get();
        } else {
            logger.error("Entity not found with ID: {}", id);
            throw new NotFoundException("No existe registros con el ID: " + id);
        }
    }

    @Transactional(readOnly = true)
    public Set<Entity> findAll() throws NotFoundException {
        Set<Entity> entities = new HashSet<>(getRepository().findAll());
        if (!entities.isEmpty()) {
            return entities;
        } else {
            logger.warn("No entities found");
            throw new NotFoundException("No hay registros");
        }
    }

    @Transactional
    public Entity save(Entity entity) {
        try {
            return getRepository().save(entity);
        } catch (DataIntegrityViolationException e) {
            logger.error("Data integrity violation while saving entity: {}", e.getMessage());
            throw new DatabaseException("Error de integridad de datos al guardar la entidad: " + e.getMessage(), e);
        } catch (Exception e) {
            logger.error("Error saving entity: {}", e.getMessage());
            throw new DatabaseException("Error al guardar la entidad: " + e.getMessage(), e);
        }
    }

    @Transactional
    public Entity update(ID id, Entity entity) throws NotFoundException {
        if (!getRepository().existsById(id)) {
            logger.warn("Entity not found with ID: {}", id);
            throw new NotFoundException("No existe el ID: " + id);
        }
        try {
            return getRepository().save(entity);
        } catch (DataIntegrityViolationException e) {
            logger.error("Data integrity violation while updating entity: {}", e.getMessage());
            throw new DatabaseException("Error de integridad de datos al actualizar la entidad: " + e.getMessage(), e);
        } catch (Exception e) {
            logger.error("Error updating entity: {}", e.getMessage());
            throw new DatabaseException("Error al actualizar la entidad: " + e.getMessage(), e);
        }
    }

    @Transactional
    public void delete(ID id) throws NotFoundException {
        if (getRepository().existsById(id)) {
            try {
                getRepository().deleteById(id);
            } catch (EmptyResultDataAccessException e) {
                logger.error("Error deleting entity with ID: {}", id);
                throw new DatabaseException("Error al eliminar el ID: " + id, e);
            }
        } else {
            logger.warn("Entity not found with ID: {}", id);
            throw new NotFoundException("No existe el ID: " + id);
        }
    }

    @Transactional(readOnly = true)
    public boolean existById(ID id) {
        if(id == null)return false;
        return getRepository().existsById(id);
    }

    @Transactional(readOnly = true)
    public long count() {
        return getRepository().count();
    }
}
