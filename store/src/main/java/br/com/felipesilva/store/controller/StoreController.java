package br.com.felipesilva.store.controller;

import br.com.felipesilva.store.dto.Purchase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreController {

    @PostMapping
    public void purchase(@RequestBody Purchase purchaseDTO) {

    }
}
