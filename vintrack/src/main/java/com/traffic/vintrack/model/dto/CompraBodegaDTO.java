package com.traffic.vintrack.model.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.Set;

public class CompraBodegaDTO {
    private Long id;

    @NotNull(message = "La fecha no puede ser nula")
    @Future(message = "La fecha debe ser posterior a la fecha y hora actual")
    private LocalDateTime fecha;

    private Double total;

    private String rutaPDF;

    @NotNull(message = "El ID de la bodega no puede ser nulo")
    @Positive(message = "El ID de la bodega debe ser un número positivo")
    private Long bodega_id;

    @NotNull(message = "Los detalles no pueden ser nulos")
    @Size(min = 1, message = "Debe haber al menos un detalle")
    private Set<CompraDetalleDTO> detalles;

    // Constructor, getters y setters

    public static class Builder {
        private Long id;
        private LocalDateTime fecha;
        private Double total;
        private String rutaPDF;
        private Long bodega_id;
        private Set<CompraDetalleDTO> detalles;

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

        public Builder bodega_id(Long proveedor) {
            this.bodega_id = proveedor;
            return this;
        }

        public Builder detalles(Set<CompraDetalleDTO> detalles) {
            this.detalles = detalles;
            return this;
        }

        public CompraBodegaDTO build() {
            CompraBodegaDTO compraBodegaDTO = new CompraBodegaDTO();
            compraBodegaDTO.setId(this.id);
            compraBodegaDTO.setFecha(this.fecha);
            compraBodegaDTO.setTotal(this.total);
            compraBodegaDTO.setRutaPDF(this.rutaPDF);
            compraBodegaDTO.setBodega_id(this.bodega_id);
            compraBodegaDTO.setDetalles(this.detalles);
            return compraBodegaDTO;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getRutaPDF() {
        return rutaPDF;
    }

    public void setRutaPDF(String rutaPDF) {
        this.rutaPDF = rutaPDF;
    }

    public Long getBodega_id() {
        return bodega_id;
    }

    public void setBodega_id(Long bodega_id) {
        this.bodega_id = bodega_id;
    }

    public Set<CompraDetalleDTO> getDetalles() {
        return detalles;
    }

    public void setDetalles(Set<CompraDetalleDTO> detalles) {
        this.detalles = detalles;
    }
}

