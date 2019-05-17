package com.dmall.inventoryservice.apis.dtos;

import lombok.Data;

@Data
public class InventoryLockRequest {

    private Long productId;

    private Integer quantity;
}
