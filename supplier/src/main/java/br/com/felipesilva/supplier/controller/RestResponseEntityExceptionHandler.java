package br.com.felipesilva.supplier.controller;

import br.com.felipesilva.supplier.exception.InfoSupplierNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class RestResponseEntityExceptionHandler {

    @ExceptionHandler(InfoSupplierNotFoundException.class)
    public ResponseEntity<String> handleInfoSupplierNotFoundException(InfoSupplierNotFoundException e) {
        log.error(e.getMessage());
        return ResponseEntity.notFound().build();
    }

}
