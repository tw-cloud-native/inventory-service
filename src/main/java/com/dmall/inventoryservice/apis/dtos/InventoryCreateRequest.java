package com.dmall.inventoryservice.apis.dtos;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InventoryCreateRequest {

    private Long productId;

    private Integer quantity;

}
