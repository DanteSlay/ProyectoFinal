package com.traffic.vintrack.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ventas_cliente_detalle")
public class VentaDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Vino vino;

    @ManyToOne(fetch = FetchType.LAZY)
    private VentaCliente ventaCliente;

    private Integer cantidad;

    private Double precioVenta;

    private Double descuento;

    public VentaDetalle() {
    }

    private VentaDetalle(Builder builder){
        this.id = builder.id;
        this.vino = builder.vino;
        this.ventaCliente = builder.ventaCliente;
        this.cantidad = builder.cantidad;
        this.descuento = builder.descuento;
    }

    public static class Builder{
        private Long id;
        private Vino vino;
        private VentaCliente ventaCliente;
        private Integer cantidad;
        private Double descuento;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder vino(Vino vino) {
            this.vino = vino;
            return this;
        }

        public Builder ventaCliente(VentaCliente ventaCliente) {
            this.ventaCliente = ventaCliente;
            return this;
        }

        public Builder cantidad(Integer cantidad) {
            this.cantidad = cantidad;
            return this;
        }

        public Builder descuento(Double descuento) {
            this.descuento = descuento;
            return this;
        }
        public VentaDetalle build() {
            return new VentaDetalle(this);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vino getVino() {
        return vino;
    }

    public void setVino(Vino vino) {
        this.vino = vino;
    }

    public VentaCliente getVentaCliente() {
        return ventaCliente;
    }

    public void setVentaCliente(VentaCliente ventaCliente) {
        this.ventaCliente = ventaCliente;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
