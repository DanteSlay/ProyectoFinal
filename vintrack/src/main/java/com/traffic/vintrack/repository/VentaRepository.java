package com.traffic.vintrack.repository;

import com.traffic.vintrack.model.entity.VentaCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<VentaCliente, Long> {
}
