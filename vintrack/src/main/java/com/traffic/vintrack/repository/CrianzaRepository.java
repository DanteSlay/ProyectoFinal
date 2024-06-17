package com.traffic.vintrack.repository;

import com.traffic.vintrack.model.entity.Crianza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrianzaRepository extends JpaRepository<Crianza, Long> {
    Crianza findByNombre(String nombre);
}
