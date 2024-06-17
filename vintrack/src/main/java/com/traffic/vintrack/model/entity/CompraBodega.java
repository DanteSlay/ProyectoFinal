package com.traffic.vintrack.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "compra_bodega")
public class CompraBodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private LocalDateTime fecha;

    private Double total;

    private String rutaPDF;

    @ManyToOne(fetch = FetchType.LAZY)
    private Bodega bodega;

    @OneToMany(mappedBy = "compraBodega",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<CompraDetalle> detalles;

    public CompraBodega() {}

    private CompraBodega(Builder builder){
        this.id = builder.id;
        this.fecha = builder.fecha;
        this.total = builder.total;
        this.rutaPDF = builder.rutaPDF;
        this.bodega = builder.bodega;
        this.detalles = builder.detalles;
    }

    public static class Builder{
        private Long id;
        private LocalDateTime fecha;
        private Double total;
        private String rutaPDF;
        private Bodega bodega;
        private Set<CompraDetalle> detalles;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder fecha(LocalDateTime fecha) {
            this.fecha = fecha;
            return this;
        }

        public Builder total(Double total) {
            this.total = total;
            return this;
        }

        public Builder rutaPDF(String rutaPDF) {
            this.rutaPDF = rutaPDF;
            return this;
        }

        public Builder bodega(Bodega bodega) {
            this.bodega = bodega;
            return this;
        }

        public Builder detalles(Set<CompraDetalle> detalles) {
            this.detalles = detalles;
            return this;
        }

        public CompraBodega build() {
            return new CompraBodega(this);
        }
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Double getTotal() {
        return total;
    }

    public String getRutaPDF() {
        return rutaPDF;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setRutaPDF(String rutaPDF) {
        this.rutaPDF = rutaPDF;
    }

    public void setBodega(Bodega proveedor) {
        this.bodega = proveedor;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setId(Long idPedidoProveedor) {
        this.id = idPedidoProveedor;
    }

    public Set<CompraDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(Set<CompraDetalle> detalles) {
        this.detalles = detalles;
    }
}
