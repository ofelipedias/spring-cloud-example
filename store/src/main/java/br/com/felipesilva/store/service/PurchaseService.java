package br.com.felipesilva.store.service;

import br.com.felipesilva.store.client.SupplierClient;
import br.com.felipesilva.store.dto.InfoSupplier;
import br.com.felipesilva.store.dto.Purchase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final SupplierClient supplierClient;

    public InfoSupplier buy(Purchase purchase) {
        log.info("Get info supplier by purchase={}", purchase);
        return supplierClient.getInfoSupplier(purchase.getAddress().getState());
    }

}
