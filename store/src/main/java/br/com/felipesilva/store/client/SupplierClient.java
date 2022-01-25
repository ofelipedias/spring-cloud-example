package br.com.felipesilva.store.client;

import br.com.felipesilva.store.dto.InfoSupplier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "supplier", url = "http://localhost:8081")
public interface SupplierClient {

    @GetMapping(value = "/info/{state}")
    InfoSupplier getInfoSupplier(@PathVariable String state);
}
