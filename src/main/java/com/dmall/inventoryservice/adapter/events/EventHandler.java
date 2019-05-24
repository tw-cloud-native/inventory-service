package com.dmall.inventoryservice.adapter.events;

import com.dmall.inventoryservice.adapter.events.order.OrderCreatedEvent;
import com.dmall.inventoryservice.infrastructure.mq.EventStreams;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class EventHandler {
  @StreamListener(EventStreams.INPUT_ORDER)
  public void receive(OrderCreatedEvent event) {
    System.out.println("received：" + event.toString());
  }
}
