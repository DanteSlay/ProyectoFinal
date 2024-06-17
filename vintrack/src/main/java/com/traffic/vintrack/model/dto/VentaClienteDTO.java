package com.traffic.vintrack.model.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.Set;

public class VentaClienteDTO {

    private Long id;
    @NotNull(message = "La fecha no puede ser nula")
    @Future(message = "La fecha debe ser posterior a la fecha y hora actual")
    private LocalDateTime fecha;
    private Double total;
    private String rutaPDF;
    private String empleado;
    @NotNull(message = "El ID del cliente no puede ser nulo")
    @Positive(message = "El ID de cliente debe ser un número positivo")
    private Long cliente;

    @NotNull(message = "Los detalles no pueden ser nulos")
    @Size(min = 1, message = "Debe haber al menos un detalle")
    private Set<VentaDetalleDTO> detalles;

    public VentaClienteDTO() {
    }

    private VentaClienteDTO(Builder builder) {
        this.id = builder.id;
        this.fecha = builder.fecha;
        this.total = builder.total;
        this.rutaPDF = builder.rutaPDF;
        this.empleado = builder.empleado;
        this.cliente = builder.cliente;
        this.detalles = builder.detalles;
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

    public String getEmpleado() {
        return empleado;
    }

    public Long getCliente() {
        return cliente;
    }

    public Set<VentaDetalleDTO> getDetalles() {
        return detalles;
    }

    public static class Builder {
        private Long id;
        private LocalDateTime fecha;
        private Double total;
        private String rutaPDF;
        private String empleado;
        private Long cliente;
        private Set<VentaDetalleDTO> detalles;

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

        public Builder empleado(String empleado) {
            this.empleado = empleado;
            return this;
        }

        public Builder cliente(Long cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder detalles(Set<VentaDetalleDTO> detalles) {
            this.detalles = detalles;
            return this;
        }

        public VentaClienteDTO build() {
            return new VentaClienteDTO(this);
        }
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    public void setDetalles(Set<VentaDetalleDTO> detalles) {
        this.detalles = detalles;
    }
}

