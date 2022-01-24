package br.com.felipesilva.store.controller;

import br.com.felipesilva.store.dto.Purchase;
import br.com.felipesilva.store.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store")
public class StoreController {

    private final PurchaseService purchaseService;

    @PostMapping
    public void purchase(@RequestBody Purchase purchase) {
        purchaseService.buy(purchase);
    }
}
