package com.traffic.vintrack.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class BodegaDTO {
    private Long id;
    @NotNull(message = "El nombre no puede ser nulo")
    @Size(min = 1, max = 100, message = "El nombre debe tener entre 1 y 100 caracteres")
    private String nombre;
    private String web;
    private String direccion;
    private String email;
    private String telefono;
    private String nombrePais;

    public BodegaDTO() {
    }

    private BodegaDTO(Builder builder){
        this.id = builder.id;
        this.nombre = builder.nombre;
        this.web = builder.web;
        this.direccion = builder.direccion;
        this.email = builder.email;
        this.telefono = builder.telefono;
        this.nombrePais = builder.nombrePais;
    }

    public static class Builder{
        private Long id;
        private String nombre;
        private String web;
        private String direccion;
        private String email;
        private String telefono;
        private String nombrePais;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder web(String web) {
            this.web = web;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder pais(String nombrePais) {
            this.nombrePais = nombrePais;
            return this;
        }

        public BodegaDTO build() {
            return new BodegaDTO(this);
        }
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

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
}
