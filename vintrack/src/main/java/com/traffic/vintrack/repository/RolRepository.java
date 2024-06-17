package com.traffic.vintrack.repository;

import com.traffic.vintrack.model.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Long> {
    boolean existsByNombre(String nombre);

    Rol findByNombre(String nombre);
}
