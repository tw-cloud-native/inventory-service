package com.dmall.inventoryservice.adapter.events;

import com.dmall.inventoryservice.adapter.events.order.OrderEvent;
import com.dmall.inventoryservice.applications.InventoryFactory;
import com.dmall.inventoryservice.applications.InventoryService;
import com.dmall.inventoryservice.domain.InventoryLock;
import com.dmall.inventoryservice.infrastructure.mq.EventStreams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EventHandler {

  private InventoryService inventoryService;

  public EventHandler(InventoryService inventoryService) {
    this.inventoryService = inventoryService;
  }

  @StreamListener(EventStreams.INPUT_ORDER)
  public void receive(OrderEvent event) {
    log.info("=======received：" + event.toString());

    if ("OrderCreated".equals(event.getEventType())) {
      InventoryLock inventoryLock = InventoryFactory.toLockDomain(event.getProductId(), event.getQuantity());
      inventoryService.lock(inventoryLock, event.getId());
    } else if ("OrderPaid".equals(event.getEventType())) {
      inventoryService.unlock(Long.valueOf(event.getLockId()));
    }
  }
}
