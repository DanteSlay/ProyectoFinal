package com.traffic.vintrack.model.entity;

import jakarta.persistence.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "bodegas", uniqueConstraints = {@UniqueConstraint(columnNames = "nombre")})
public class Bodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String web;
    private String direccion;
    private String email;
    private String telefono;

    @ManyToOne(fetch = FetchType.LAZY)
    private Pais pais;

    public Bodega() {}

    private Bodega(Builder builder) {
        this.id = builder.id;
        this.nombre = builder.nombre;
        this.web = builder.web;
        this.direccion = builder.direccion;
        this.email = builder.email;
        this.telefono = builder.telefono;
        this.pais = builder.pais;
    }

    public static class Builder {
        private Long id;
        private String nombre;
        private String web;
        private String direccion;
        private String email;
        private String telefono;
        private Pais pais;

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

        public Builder pais(Pais pais) {
            this.pais = pais;
            return this;
        }

        public Bodega build() {
            return new Bodega(this);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idBodega) {
        this.id = idBodega;
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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object instanceof HibernateProxy) {
            object = ((HibernateProxy) object).getHibernateLazyInitializer().getImplementation();
        }
        if (object == null || getClass() != object.getClass()) return false;
        Bodega bodega = (Bodega) object;
        return Objects.equals(id, bodega.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
