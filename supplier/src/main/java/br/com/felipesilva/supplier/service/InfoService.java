package br.com.felipesilva.supplier.service;

import br.com.felipesilva.supplier.exception.InfoSupplierNotFoundException;
import br.com.felipesilva.supplier.model.InfoSupplier;
import br.com.felipesilva.supplier.repository.InfoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class InfoService {

    private final InfoRepository infoRepository;

    public InfoSupplier getInfoByState(String state) throws InfoSupplierNotFoundException {
        log.info("Get info supplier by state={}", state);
        return infoRepository.findByStateEqualsIgnoreCase(state)
                .orElseThrow(() -> new InfoSupplierNotFoundException(state));
    }
}
