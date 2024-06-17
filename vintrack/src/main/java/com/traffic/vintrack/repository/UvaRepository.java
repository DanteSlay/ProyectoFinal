package com.traffic.vintrack.repository;

import com.traffic.vintrack.model.entity.Uva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UvaRepository extends JpaRepository<Uva, Long> {
    Uva findByNombre(String nombre);
}
