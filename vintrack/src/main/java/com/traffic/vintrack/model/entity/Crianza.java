package com.traffic.vintrack.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "crianza_vinos")
public class Crianza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "El nombre no puede ser nulo")
    @Size(min = 1, max = 100, message = "El nombre debe tener entre 1 y 100 caracteres")
    private String nombre; // JOVEN, CRIANZA, RESERVA, GRAN_RESERVA;

    public Crianza() {
    }

    private Crianza(Builder builder) {
        this.id = builder.id;
        this.nombre = builder.nombre;
    }

    public static class Builder {
        private Long id;
        private String nombre;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Crianza build() {
            return new Crianza(this);
        }
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Long idCrianza) {
        this.id = idCrianza;
    }
}
