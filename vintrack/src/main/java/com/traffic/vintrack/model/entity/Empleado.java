package com.traffic.vintrack.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    private String username;

    private String email;

    private String password;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @ManyToMany
    private Set<Rol> roles;

    public Empleado() {
        this.roles = new HashSet<>();
    }

    private Empleado(Builder builder){
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.username = builder.nombre + builder.apellido;
        this.email = builder.email;
        this.password = builder.password;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.roles = builder.roles;
    }

    public static class Builder {
        private String nombre;
        private String apellido;
        private String email;
        private String password;
        private LocalDate fechaNacimiento;
        private Set<Rol> roles;

        public Builder(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.roles = new HashSet<>();
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder fechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Builder roles(Set<Rol> roles) {
            this.roles = roles;
            return this;
        }

        public Empleado build() {
            return new Empleado(this);
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
}