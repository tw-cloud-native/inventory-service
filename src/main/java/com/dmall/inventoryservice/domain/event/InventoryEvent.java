package com.dmall.inventoryservice.domain.event;

import com.dmall.inventoryservice.domain.InventoryLock;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class InventoryEvent {

  private String orderId;

  private Long lockId;

  private Long productId;

  private Integer quantity;

  private String eventType;

  public static InventoryEvent lockedEvent(InventoryLock inventoryLock,String orderId, Long lockId) {
    return InventoryEvent.builder()
      .orderId(orderId)
      .lockId(lockId)
      .productId(inventoryLock.getProductId())
      .quantity(inventoryLock.getQuantity())
      .eventType("InventoryLocked")
      .build();
  }

  public static InventoryEvent unlockedEvent(InventoryLock inventoryLock) {
    return InventoryEvent.builder()
      .productId(inventoryLock.getProductId())
      .quantity(inventoryLock.getQuantity())
      .eventType("InventoryUnlocked")
      .build();
  }
}
