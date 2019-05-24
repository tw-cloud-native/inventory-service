package com.dmall.inventoryservice.adapter.events;

import com.dmall.inventoryservice.adapter.events.order.OrderCreatedEvent;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class EventHandler {
  @StreamListener(Streams.INPUT_ORDER)
  public void receive(OrderCreatedEvent event) {
    System.out.println("收到：" + event.toString());
  }
}
