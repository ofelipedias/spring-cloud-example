package br.com.felipesilva.supplier.exception;

import lombok.Getter;

@Getter
public class InfoSupplierNotFoundException extends Exception {

    public InfoSupplierNotFoundException(String state) {
        super(String.format("Info Supplier not found by state=%s", state));
    }

}
