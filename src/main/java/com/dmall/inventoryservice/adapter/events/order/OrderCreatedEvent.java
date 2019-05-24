package com.dmall.inventoryservice.adapter.events.order;

import lombok.ToString;
import lombok.Value;

import java.math.BigDecimal;

@Value
@ToString
public class OrderCreatedEvent {
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
