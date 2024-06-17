package com.traffic.vintrack.model.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "paises", uniqueConstraints = {@UniqueConstraint(columnNames = "nombre")})
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    public Pais() {}

    public Pais(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Pais pais = (Pais) object;

        if (!Objects.equals(id, pais.id)) return false;
        return Objects.equals(nombre, pais.nombre);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
