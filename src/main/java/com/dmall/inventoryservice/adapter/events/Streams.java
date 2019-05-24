package com.dmall.inventoryservice.adapter.events;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Streams {

    String INPUT_ORDER = "inputOrder";

    @Input(INPUT_ORDER)
    SubscribableChannel inputOrder();
}
