package com.traffic.vintrack.base.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PageService<Entity> {
    Page<Entity> getAll(Pageable pageable);
}
