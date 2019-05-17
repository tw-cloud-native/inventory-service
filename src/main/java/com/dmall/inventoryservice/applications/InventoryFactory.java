package com.dmall.inventoryservice.applications;

import com.dmall.inventoryservice.domain.Inventory;
import com.dmall.inventoryservice.domain.InventoryLock;

public class InventoryFactory {

    public static Inventory toDomain(long productId, int quantity) {
        Inventory inventory = new Inventory();
        inventory.setProductId(productId);
        inventory.setQuantity(quantity);
        return inventory;
    }

    public static InventoryLock toLockDomain(long productId, int quantity) {
        InventoryLock inventory = new InventoryLock();
        inventory.setProductId(productId);
        inventory.setQuantity(quantity);
        return inventory;
    }
}
