package com.traffic.vintrack.model.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class EmpleadoDTO {
    private String nombre;
    private String apellido;
    private String username;
    private String email;
    private LocalDate fechaNacimiento;
    private Set<String> roles;

    public EmpleadoDTO() {
        this.roles = new HashSet<>();
    }

    private EmpleadoDTO(Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.username = builder.username;
        this.email = builder.email;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.roles = builder.roles;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    // Builder
    public static class Builder {
        private String nombre;
        private String apellido;
        private String username;
        private String email;
        private LocalDate fechaNacimiento;
        private Set<String> roles = new HashSet<>();

        public Builder() {
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder apellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder fechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Builder roles(Set<String> roles) {
            this.roles = roles;
            return this;
        }

        public EmpleadoDTO build() {
            return new EmpleadoDTO(this);
        }
    }

}
