package com.traffic.vintrack.repository;

import com.traffic.vintrack.model.entity.Vino;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VinoRepository extends JpaRepository<Vino, Long> {

    Optional<Vino> findByNombre(String nombre);

    Page<Vino> findAll(Specification<Vino> buildSpecification, Pageable pageable);
}
