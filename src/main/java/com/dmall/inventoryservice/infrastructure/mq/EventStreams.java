package com.dmall.inventoryservice.infrastructure.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface EventStreams {

    String INPUT_ORDER = "inputOrder";
    String OUTPUT_INVENTORY = "outputInventory";

    @Input(INPUT_ORDER)
    SubscribableChannel inputOrder();

    @Output(OUTPUT_INVENTORY)
    MessageChannel outputInventory();
}
