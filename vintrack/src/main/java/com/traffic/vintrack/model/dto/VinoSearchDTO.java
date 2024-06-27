package com.traffic.vintrack.model.dto;

import java.util.List;

public class VinoSearchDTO {
    private String nombre;
    private Double precioVentaMin;
    private Double precioVentaMax;
    private Integer añoProduccionMin;
    private Integer añoProduccionMax;
    private List<Long> pais_id;
    private List<Long> bodega_id;
    private List<Long> tipo_id;
    private List<Long> crianza_id;

    public VinoSearchDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioVentaMin() {
        return precioVentaMin;
    }

    public void setPrecioVentaMin(Double precioVentaMin) {
        this.precioVentaMin = precioVentaMin;
    }

    public Double getPrecioVentaMax() {
        return precioVentaMax;
    }

    public void setPrecioVentaMax(Double precioVentaMax) {
        this.precioVentaMax = precioVentaMax;
    }

    public Integer getAñoProduccionMin() {
        return añoProduccionMin;
    }

    public void setAñoProduccionMin(Integer añoProduccionMin) {
        this.añoProduccionMin = añoProduccionMin;
    }

    public Integer getAñoProduccionMax() {
        return añoProduccionMax;
    }

    public void setAñoProduccionMax(Integer añoProduccionMax) {
        this.añoProduccionMax = añoProduccionMax;
    }

    public List<Long> getPais_id() {
        return pais_id;
    }

    public void setPais_id(List<Long> pais_id) {
        this.pais_id = pais_id;
    }

    public List<Long> getBodega_id() {
        return bodega_id;
    }

    public void setBodega_id(List<Long> bodega_id) {
        this.bodega_id = bodega_id;
    }

    public List<Long> getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(List<Long> tipo_id) {
        this.tipo_id = tipo_id;
    }

    public List<Long> getCrianza_id() {
        return crianza_id;
    }

    public void setCrianza_id(List<Long> crianza_id) {
        this.crianza_id = crianza_id;
    }
}
