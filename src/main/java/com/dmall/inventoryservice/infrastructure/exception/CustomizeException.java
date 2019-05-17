package com.dmall.inventoryservice.infrastructure.exception;

public class CustomizeException extends RuntimeException {

    public CustomizeException(String errorMessage) {
        super(errorMessage);
    }

}
