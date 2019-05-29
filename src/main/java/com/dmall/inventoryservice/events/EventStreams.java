package com.dmall.inventoryservice.events;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface EventStreams {

    String INPUT_ORDER = "inputOrder";

    @Input(INPUT_ORDER)
    SubscribableChannel inputOrder();

}
