package com.traffic.vintrack.repository;


import com.traffic.vintrack.model.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<Pais, Long> {
    Pais findByNombre(String nombrePais);
}
