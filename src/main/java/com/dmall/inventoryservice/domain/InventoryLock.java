package com.dmall.inventoryservice.domain;

import lombok.Data;

@Data
public class InventoryLock {

    private Long productId;

    private Integer quantity;
}
