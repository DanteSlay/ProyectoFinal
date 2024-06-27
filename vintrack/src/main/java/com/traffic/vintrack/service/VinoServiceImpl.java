package com.traffic.vintrack.service;


import com.traffic.vintrack.base.service.CrudAndPageServiceImpl;
import com.traffic.vintrack.exception.CantidadExcesiva;
import com.traffic.vintrack.model.dto.VinoSearchDTO;
import com.traffic.vintrack.model.entity.Vino;
import com.traffic.vintrack.model.mapper.VinoMapper;
import com.traffic.vintrack.repository.VinoRepository;
import jakarta.persistence.criteria.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class VinoServiceImpl extends CrudAndPageServiceImpl<Vino, Long> implements VinoService {

    private final VinoRepository vinoRepository;
    private final VinoMapper mapper;

    @Autowired
    public VinoServiceImpl(VinoRepository vinoRepository, VinoMapper mapper) {
        this.vinoRepository = vinoRepository;
        this.mapper = mapper;
    }

    @Override
    protected JpaRepository<Vino, Long> getRepository() {
        return vinoRepository;
    }

    public void añadirCantidad(final Vino vino, final Integer cantidad) {
        Integer cantidadActual = vino.getCantidad();
        vino.setCantidad(cantidadActual + cantidad);
        save(vino);
    }

    @Override
    public void restarCantidad(Vino vino, Integer cantidad) {
        if (vino.getCantidad() < cantidad) {
            throw new CantidadExcesiva();
        }else {
            vino.setCantidad(vino.getCantidad() - cantidad);
            save(vino);
        }
    }

    @Transactional(readOnly = true)
    public Page<Vino> searchVinos(VinoSearchDTO vinoSearchDTO, Pageable pageable) {
        return vinoRepository.findAll(buildSpecification(vinoSearchDTO), pageable);
    }

    private Specification<Vino> buildSpecification(VinoSearchDTO vinoSearchDTO) {
        return (root, query, builder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (vinoSearchDTO.getNombre() != null && !vinoSearchDTO.getNombre().isEmpty()) {
                predicates.add(builder.like(builder.lower(root.get("nombre")), "%" + vinoSearchDTO.getNombre().toLowerCase() + "%"));
            }

            if (vinoSearchDTO.getPrecioVentaMin() != null) {
                predicates.add(builder.greaterThanOrEqualTo(root.get("precioVenta"), vinoSearchDTO.getPrecioVentaMin()));
            }

            if (vinoSearchDTO.getPrecioVentaMax() != null) {
                predicates.add(builder.lessThanOrEqualTo(root.get("precioVenta"), vinoSearchDTO.getPrecioVentaMax()));
            }

            if (vinoSearchDTO.getAñoProduccionMin() != null) {
                predicates.add(builder.greaterThanOrEqualTo(root.get("añoProduccion"), vinoSearchDTO.getAñoProduccionMin()));
            }

            if (vinoSearchDTO.getAñoProduccionMax() != null) {
                predicates.add(builder.lessThanOrEqualTo(root.get("añoProduccion"), vinoSearchDTO.getAñoProduccionMax()));
            }

            if (vinoSearchDTO.getPais_id() != null && !vinoSearchDTO.getPais_id().isEmpty()) {
                predicates.add(root.get("pais").get("id").in(vinoSearchDTO.getPais_id()));
            }

            if (vinoSearchDTO.getBodega_id() != null && !vinoSearchDTO.getBodega_id().isEmpty()) {
                predicates.add(root.get("bodega").get("id").in(vinoSearchDTO.getBodega_id()));
            }

            if (vinoSearchDTO.getTipo_id() != null && !vinoSearchDTO.getTipo_id().isEmpty()) {
                predicates.add(root.get("tipoVino").get("id").in(vinoSearchDTO.getTipo_id()));
            }

            if (vinoSearchDTO.getCrianza_id() != null && !vinoSearchDTO.getCrianza_id().isEmpty()) {
                predicates.add(root.get("crianza").get("id").in(vinoSearchDTO.getCrianza_id()));
            }

            return builder.and(predicates.toArray(new Predicate[0]));
        };
    }

}
