package com.traffic.vintrack.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExcepcionesGlobales {    @ExceptionHandler(NotFoundException.class)
public ResponseEntity<String> handleNotFoundException(NotFoundException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Recurso no encontrado: " + ex.getMessage());
}

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<String> handleException(DatabaseException ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + ex.getMessage());
    }

    @ExceptionHandler(CantidadExcesiva.class)
    public ResponseEntity<String> handleCantidadExcesiva(CantidadExcesiva ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + ex.getMessage());
    }
}

