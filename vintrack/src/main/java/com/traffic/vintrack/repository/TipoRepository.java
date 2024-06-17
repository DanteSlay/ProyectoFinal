package com.traffic.vintrack.repository;


import com.traffic.vintrack.model.entity.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TipoRepository extends JpaRepository<Tipo, Long> {
    Tipo findByNombre(String nombre);
}
