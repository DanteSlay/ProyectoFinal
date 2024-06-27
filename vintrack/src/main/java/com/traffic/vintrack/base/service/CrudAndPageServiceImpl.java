package com.traffic.vintrack.base.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public abstract class CrudAndPageServiceImpl<ENTITY, ID> extends CrudServiceImpl<ENTITY, ID> implements PageService<ENTITY> {

    @Override
    public Page<ENTITY> getAll(Pageable pageable) {
        return getRepository().findAll(pageable);
    }
}
