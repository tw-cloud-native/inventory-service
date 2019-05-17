package com.dmall.inventoryservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
    private long id;

    private Long productId;

    private Integer quantity;

    public Inventory deductProduct(Integer num) {
        this.setQuantity(this.quantity - num);
        return this;
    }
}
