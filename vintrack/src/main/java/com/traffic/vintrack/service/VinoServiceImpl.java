package com.traffic.vintrack.service;


import com.traffic.vintrack.base.service.CrudAndPageServiceImpl;
import com.traffic.vintrack.exception.CantidadExcesiva;
import com.traffic.vintrack.model.entity.Vino;
import com.traffic.vintrack.model.mapper.VinoMapper;
import com.traffic.vintrack.repository.VinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

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


}
