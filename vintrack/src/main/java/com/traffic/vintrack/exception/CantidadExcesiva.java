package com.traffic.vintrack.exception;

public class CantidadExcesiva extends RuntimeException {

    public CantidadExcesiva() {
        super("La cantidad a restar es mayor que la cantidad disponible.");
    }
}
