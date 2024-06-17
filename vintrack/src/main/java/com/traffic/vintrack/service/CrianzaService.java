package com.traffic.vintrack.service;


import com.traffic.vintrack.base.service.CrudService;
import com.traffic.vintrack.model.entity.Crianza;

public interface CrianzaService extends CrudService<Crianza, Long> {
    Crianza findByNombre(String nombre);
}
