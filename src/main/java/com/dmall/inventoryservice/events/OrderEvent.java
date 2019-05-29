package com.dmall.inventoryservice.events;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
@NoArgsConstructor
public class OrderEvent {
  private String id;
  private long productId;
  private int quantity;
  private BigDecimal totalPrice;
  private String address;
  private String phoneNumber;
  private boolean paid;
  private String lockId;
  private String eventType;
}
