package com.traffic.vintrack.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "ventas_cliente")
public class VentaCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fecha;

    private Double total;

    private String rutaPDF;

    @ManyToOne
    private Empleado empleado;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;

    @OneToMany(mappedBy = "ventaCliente",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<VentaDetalle> detalles;

    public VentaCliente() {
    }

    private VentaCliente(Builder builder) {
        this.id = builder.id;
        this.fecha = builder.fecha;
        this.total = builder.total;
        this.rutaPDF = builder.rutaPDF;
        this.empleado = builder.empleado;
        this.cliente = builder.cliente;
        this.detalles = builder.detalles;
    }

    public static class Builder {
        private Long id;
        private LocalDateTime fecha;
        private Double total;
        private String rutaPDF;
        private Empleado empleado;
        private Cliente cliente;
        private Set<VentaDetalle> detalles;

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

        public Builder empleado(Empleado empleado) {
            this.empleado = empleado;
            return this;
        }

        public Builder cliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder detalles(Set<VentaDetalle> detalles) {
            this.detalles = detalles;
            return this;
        }

        public VentaCliente build() {
            return new VentaCliente(this);
        }
    }

    public Long getId() {
        return id;
    }

    public Double getTotal() {
        return total;
    }

    public String getRutaPDF() {
        return rutaPDF;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setId(Long idCompraCliente) {
        this.id = idCompraCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
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

    public void setEmpleado(Empleado empleado_id) {
        this.empleado = empleado_id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<VentaDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(Set<VentaDetalle> detalles) {
        this.detalles = detalles;
    }
}
