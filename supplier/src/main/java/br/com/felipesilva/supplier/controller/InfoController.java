package br.com.felipesilva.supplier.controller;

import br.com.felipesilva.supplier.model.InfoSupplier;
import br.com.felipesilva.supplier.service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/info")
public class InfoController {

    private final InfoService infoService;

    @GetMapping("/{state}")
    public ResponseEntity<InfoSupplier> getInfoByState(@PathVariable String state) {
        try {
            return ResponseEntity.ok(infoService.getInfoByState(state));
        } catch (Exception e) {
            return ResponseEntity.notFound().build(); // TODO implementar ControllerAdvice para tratar exceptions
        }
    }
}
