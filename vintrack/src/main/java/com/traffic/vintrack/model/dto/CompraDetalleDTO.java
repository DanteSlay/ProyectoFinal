package com.traffic.vintrack.model.dto;


public class CompraDetalleDTO {
    private Long vino_id;
    private Integer cantidad;
    private Double precio_unitario;


    public CompraDetalleDTO(Long vino_id, Integer cantidad, Double precio_unitario) {
        this.vino_id = vino_id;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }

    public CompraDetalleDTO() {

    }

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

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }
}

