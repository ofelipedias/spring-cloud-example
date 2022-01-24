package br.com.felipesilva.supplier.repository;

import br.com.felipesilva.supplier.model.InfoSupplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface InfoRepository extends JpaRepository<InfoSupplier, BigInteger> {

    Optional<InfoSupplier> findByStateEqualsIgnoreCase(String state);
}
