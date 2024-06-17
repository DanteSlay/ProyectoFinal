package com.traffic.vintrack.repository;

import com.traffic.vintrack.model.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    boolean existsByUsername(String username);

    Empleado findByUsername(String username);
}
