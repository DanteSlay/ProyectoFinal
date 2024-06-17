package com.traffic.vintrack.model.dto;

public class VentaDetalleDTO {
    private Long vino_id;
    private Integer cantidad;
    private Double precio_venta;

    public VentaDetalleDTO() {
    }

    private VentaDetalleDTO(Builder builder) {
        this.vino_id = builder.vino_id;
        this.cantidad = builder.cantidad;
        this.precio_venta = builder.precio_venta;
    }

    // Getters y setters


    public Long getVino_id() {
        return vino_id;
    }

    public void setVino_id(Long vino_id) {
        this.vino_id = vino_id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    // Builder
    public static class Builder {
        private Long vino_id;
        private Integer cantidad;

        private Double precio_venta;


        public Builder vino(Long vino) {
            this.vino_id = vino;
            return this;
        }

        public Builder cantidad(Integer cantidad) {
            this.cantidad = cantidad;
            return this;
        }

        public Builder precio(Double precio) {
            this.precio_venta = precio;
            return this;
        }

        public VentaDetalleDTO build() {
            return new VentaDetalleDTO(this);
        }
    }
}

