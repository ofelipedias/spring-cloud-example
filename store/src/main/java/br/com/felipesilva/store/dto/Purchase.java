package br.com.felipesilva.store.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {

    private List<PurchaseItem> items;
    private Address address;
}
