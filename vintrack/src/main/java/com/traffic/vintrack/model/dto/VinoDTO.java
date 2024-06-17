package com.traffic.vintrack.model.dto;


public class VinoDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer añoProduccion;
    private Double gradosAlcohol;
    private Double volumenBotella;
    private Integer cantidad;
    private String imagen;
    private String tipo;
    private String crianza;
    private Long bodega;
    private String pais;
    private String uva;

    public VinoCardDTO toCardDTO(){
        return new VinoCardDTO.Builder()
                .id(this.id)
                .nombre(this.nombre)
                .descripcion(this.descripcion)
                .precio(this.precio)
                .añoProduccion(this.añoProduccion)
                .imagen(this.imagen)
                .build();
    }
    private VinoDTO(Builder builder){
        this.id = builder.id;
        this.nombre = builder.nombre;
        this.descripcion = builder.descripcion;
        this.añoProduccion = builder.añoProduccion;
        this.gradosAlcohol = builder.gradosAlcohol;
        this.volumenBotella = builder.volumenBotella;
        this.cantidad = builder.cantidad;
        this.imagen = builder.imagen;
        this.tipo = builder.tipo;
        this.crianza = builder.crianza;
        this.bodega = builder.bodega;
        this.pais = builder.pais;
        this.precio = builder.precio;
        this.uva = builder.uva;
    }

    public static class Builder{
        private Long id;
        private String nombre;
        private String descripcion;
        private Integer añoProduccion;
        private Double gradosAlcohol;
        private Double volumenBotella;
        private Integer cantidad;
        private String imagen;
        private String tipo;
        private String crianza;
        private Long bodega;
        private String pais;

        private String uva;
        private Double precio;


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

        public Builder añoProduccion(Integer añoProduccion) {
            this.añoProduccion = añoProduccion;
            return this;
        }

        public Builder gradosAlcohol(Double gradosAlcohol) {
            this.gradosAlcohol = gradosAlcohol;
            return this;
        }

        public Builder precio(Double precio) {
            this.precio = precio;
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

        public Builder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder crianza(String crianza) {
            this.crianza = crianza;
            return this;
        }

        public Builder bodega(Long bodega) {
            this.bodega = bodega;
            return this;
        }

        public Builder pais(String pais) {
            this.pais = pais;
            return this;
        }

        public Builder uva(String uva) {
            this.uva = uva;
            return this;
        }

        public VinoDTO build() {
            return new VinoDTO(this);
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCrianza() {
        return crianza;
    }

    public void setCrianza(String crianza) {
        this.crianza = crianza;
    }

    public Long getBodega() {
        return bodega;
    }

    public void setBodega(Long bodega) {
        this.bodega = bodega;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getUva() {
        return uva;
    }

    public void setUva(String uva) {
        this.uva = uva;
    }
}
