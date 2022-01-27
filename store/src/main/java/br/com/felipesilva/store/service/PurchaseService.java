package br.com.felipesilva.store.service;

import br.com.felipesilva.store.client.SupplierClient;
import br.com.felipesilva.store.dto.InfoSupplier;
import br.com.felipesilva.store.dto.Purchase;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    @LoadBalanced
    private final SupplierClient supplierClient;

    public InfoSupplier buy(Purchase purchase) {
        return supplierClient.getInfoSupplier(purchase.getAddress().getState());
    }

}
