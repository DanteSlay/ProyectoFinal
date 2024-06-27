package com.traffic.vintrack.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "uvas")
public class Uva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre; // TEMPRANILLO, Pinot Noir, Sauvignon Blanc

    @Lob
    @Column(columnDefinition = "TEXT")
    private String descripcion;

    public Uva() {
    }

    public Uva(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idUva) {
        this.id = idUva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
