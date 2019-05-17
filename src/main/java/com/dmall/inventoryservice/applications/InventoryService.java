package com.dmall.inventoryservice.applications;

import com.dmall.inventoryservice.domain.Inventory;
import com.dmall.inventoryservice.domain.InventoryLock;
import com.dmall.inventoryservice.infrastructure.repositories.InventoryLockRepository;
import com.dmall.inventoryservice.infrastructure.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private InventoryLockRepository inventoryLockRepository;

    public void save(Inventory inventory) {
        inventoryRepository.save(inventory);
    }

    public Long saveInventoryLock(InventoryLock inventoryLock) {
        return inventoryLockRepository.save(inventoryLock);
    }

    @Transactional
    public void unlock(long id) {
        InventoryLock inventoryLock = inventoryLockRepository.findById(id);
        inventoryLockRepository.deleteById(id);
        Inventory inventory = inventoryRepository.findByProductId(inventoryLock.getProductId());
        inventory.deductProduct(inventoryLock.getQuantity());
        inventoryRepository.updateInventory(inventory);
    }
}
