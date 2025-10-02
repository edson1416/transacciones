package com.edsonsarmiento.transacciones.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ValidacionExcepciones {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> manejoValidacionExcepciones(MethodArgumentNotValidException exception){
        Map<String, String> errores = new HashMap<>();

        exception.getBindingResult().getFieldErrors().forEach(error -> {
            errores.put(error.getField(), error.getDefaultMessage());
        });
        return new ResponseEntity<>(errores, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> manejoDataIntegrityExcepciones(DataIntegrityViolationException exception){
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body("No se puede eliminar este tipo de transaccion porque esta en uso por otros registros");
    }
}
