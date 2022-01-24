package br.com.felipesilva.supplier.service;

import br.com.felipesilva.supplier.exception.InfoSupplierNotFoundException;
import br.com.felipesilva.supplier.model.InfoSupplier;
import br.com.felipesilva.supplier.repository.InfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoService {

    private final InfoRepository infoRepository;

    public InfoSupplier getInfoByState(String state) throws InfoSupplierNotFoundException {
        return infoRepository.findByStateEqualsIgnoreCase(state)
                .orElseThrow(() -> new InfoSupplierNotFoundException("Info Supplier not found by state!"));
    }
}
