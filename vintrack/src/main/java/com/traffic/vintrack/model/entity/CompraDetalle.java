package com.traffic.vintrack.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "compra_bodega_detalle")
public class CompraDetalle{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private CompraBodega compraBodega;

    @ManyToOne(fetch = FetchType.LAZY)
    private Vino vino;

    private Integer cantidad;

    private Double precio_unitario;

    public CompraDetalle() {
    }

    private CompraDetalle (Builder builder){
        this.id = builder.id;
        this.compraBodega = builder.compraBodega;
        this.vino = builder.vino;
        this.cantidad = builder.cantidad;
        this.precio_unitario = builder.precio_unitario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CompraBodega getCompraBodega() {
        return compraBodega;
    }

    public void setCompraBodega(CompraBodega compraBodega) {
        this.compraBodega = compraBodega;
    }

    public Vino getVino() {
        return vino;
    }

    public void setVino(Vino vino) {
        this.vino = vino;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public static class Builder {
        private Long id;
        private CompraBodega compraBodega;
        private Vino vino;
        private Integer cantidad;

        private Double precio_unitario;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder compraBodega(CompraBodega compraBodega) {
            this.compraBodega = compraBodega;
            return this;
        }

        public Builder vino(Vino vino) {
            this.vino = vino;
            return this;
        }

        public Builder cantidad(Integer cantidad) {
            this.cantidad = cantidad;
            return this;
        }

        public Builder precioUnitario(Double precio_unitario){
            this.precio_unitario = precio_unitario;
            return this;
        }

        public CompraDetalle build(){
            return new CompraDetalle(this);
        }
    }


}
