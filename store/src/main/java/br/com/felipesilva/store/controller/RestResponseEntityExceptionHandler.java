package br.com.felipesilva.store.controller;

import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class RestResponseEntityExceptionHandler {

    @ExceptionHandler(FeignException.class)
    public ResponseEntity<String> handleFeignStatusException(FeignException e) {
        log.error("Error on feign integration! status={}, message={}", e.status(), e.getMessage());
        return ResponseEntity.internalServerError().body("System unavailable, please try again later!");
    }
}
