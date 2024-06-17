package com.traffic.vintrack.model.entity;

import jakarta.persistence.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(
        name = "vinos",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"nombre"})}
)
public class Vino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private Double precioVenta;
    private Double precioCosto;

    private Double descuento;

    private Integer añoProduccion;

    private Double gradosAlcohol;

    private Double volumenBotella;

    private Integer cantidad;

    private String imagen;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Tipo tipoVino;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Pais pais;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Uva tipoUva;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Bodega bodega;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Crianza crianza;

    public Vino() {
    }

    // Constructor privado para el Builder
    private Vino(Builder builder) {
        this.id = builder.idVino;
        this.nombre = builder.nombre;
        this.descripcion = builder.descripcion;
        this.precioVenta = builder.precioVenta;
        this.añoProduccion = builder.añoProduccion;
        this.gradosAlcohol = builder.gradosAlcohol;
        this.volumenBotella = builder.volumenBotella;
        this.cantidad = builder.cantidad;
        this.imagen = builder.imagen;
        this.tipoVino = builder.tipoVino;
        this.pais = builder.pais;
        this.tipoUva = builder.tipoUva;
        this.bodega = builder.bodega;
        this.crianza = builder.crianza;
        this.precioCosto = builder.precioCosto;
        this.descuento = builder.descuento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idVino) {
        this.id = idVino;
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

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precio) {
        this.precioVenta = precio;
    }

    public Integer getAñoProduccion() {
        return añoProduccion;
    }

    public void setAñoProduccion(Integer añoProduccion) {
        this.añoProduccion = añoProduccion;
    }

    public Double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(Double gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public Double getVolumenBotella() {
        return volumenBotella;
    }

    public void setVolumenBotella(Double volumenBotella) {
        this.volumenBotella = volumenBotella;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Tipo getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(Tipo tipoVino) {
        this.tipoVino = tipoVino;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Uva getTipoUva() {
        return tipoUva;
    }

    public void setTipoUva(Uva tipoUva) {
        this.tipoUva = tipoUva;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public Crianza getCrianza() {
        return crianza;
    }

    public void setCrianza(Crianza crianza) {
        this.crianza = crianza;
    }

    public Double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    // Builder
    public static class Builder {
        private Long idVino;
        private String nombre;
        private String descripcion;
        private Double precioVenta;
        private Double precioCosto;

        private Double descuento;
        private Integer añoProduccion;
        private Double gradosAlcohol;
        private Double volumenBotella;
        private Integer cantidad;
        private String imagen;
        private Tipo tipoVino;
        private Pais pais;
        private Uva tipoUva;
        private Bodega bodega;
        private Crianza crianza;

        // Constructor del Builder
        public Builder() {
        }

        public Builder idVino(Long idVino) {
            this.idVino = idVino;
            return this;
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public Builder precioVenta(Double precio) {
            this.precioVenta = precio;
            return this;
        }

        public Builder precioCosto(Double precio) {
            this.precioCosto = precio;
            return this;
        }

        public Builder descuento(Double descuento) {
            this.descuento = descuento;
            return this;
        }

        public Builder añoProduccion(Integer añoProduccion) {
            this.añoProduccion = añoProduccion;
            return this;
        }

        public Builder gradosAlcohol(Double gradosAlcohol) {
            this.gradosAlcohol = gradosAlcohol;
            return this;
        }

        public Builder volumenBotella(Double volumenBotella) {
            this.volumenBotella = volumenBotella;
            return this;
        }

        public Builder cantidad(Integer cantidad) {
            this.cantidad = cantidad;
            return this;
        }

        public Builder imagen(String imagen) {
            this.imagen = imagen;
            return this;
        }

        public Builder tipoVino(Tipo tipoVino) {
            this.tipoVino = tipoVino;
            return this;
        }

        public Builder pais(Pais pais) {
            this.pais = pais;
            return this;
        }

        public Builder tipoUva(Uva tipoUva) {
            this.tipoUva = tipoUva;
            return this;
        }

        public Builder bodega(Bodega bodega) {
            this.bodega = bodega;
            return this;
        }

        public Builder crianza(Crianza crianza) {
            this.crianza = crianza;
            return this;
        }

        public Vino build() {
            return new Vino(this);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object instanceof HibernateProxy) {
            object = ((HibernateProxy) object).getHibernateLazyInitializer().getImplementation();
        }
        if (object == null || getClass() != object.getClass()) return false;
        Vino vino = (Vino) object;
        return Objects.equals(id, vino.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
