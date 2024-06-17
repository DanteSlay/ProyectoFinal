package com.traffic.vintrack.model.dto;


public class VinoCardDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer añoProduccion;
    private String imagen;

    private VinoCardDTO(Builder builder) {
        this.id = builder.id;
        this.nombre = builder.nombre;
        this.descripcion = builder.descripcion;
        this.precio = builder.precio;
        this.añoProduccion = builder.añoProduccion;
        this.imagen = builder.imagen;
    }

    public static class Builder {
        private Long id;
        private String nombre;
        private String descripcion;
        private Double precio;
        private Integer añoProduccion;
        private String imagen;

        public Builder id(Long id) {
            this.id = id;
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

        public Builder precio(Double precio) {
            this.precio = precio;
            return this;
        }

        public Builder añoProduccion(Integer añoProduccion) {
            this.añoProduccion = añoProduccion;
            return this;
        }

        public Builder imagen(String imagen) {
            this.imagen = imagen;
            return this;
        }

        public VinoCardDTO build() {
            return new VinoCardDTO(this);
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getAñoProduccion() {
        return añoProduccion;
    }

    public void setAñoProduccion(Integer añoProduccion) {
        this.añoProduccion = añoProduccion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
