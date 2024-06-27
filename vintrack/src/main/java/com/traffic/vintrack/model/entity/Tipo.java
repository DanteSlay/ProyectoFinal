package com.traffic.vintrack.model.entity;

import jakarta.persistence.*;

@Table(name = "tipo_vinos", uniqueConstraints = {@UniqueConstraint(columnNames = {"nombre"})})
@Entity
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre; // TINTO, BLANCO, ROSADO

    public Tipo() {}

    public Tipo(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setId(Long idTipoVino) {
        this.id = idTipoVino;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
