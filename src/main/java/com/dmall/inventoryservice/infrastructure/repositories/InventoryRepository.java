package com.dmall.inventoryservice.infrastructure.repositories;

import com.dmall.inventoryservice.domain.Inventory;
import com.dmall.inventoryservice.infrastructure.exception.CustomizeException;
import com.dmall.inventoryservice.infrastructure.repositories.entity.InventoryEntity;
import com.dmall.inventoryservice.infrastructure.repositories.persistence.InventoryPersistence;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InventoryRepository {

    private static final ModelMapper mapper = new ModelMapper();

    @Autowired
    private InventoryPersistence repository;

    public void save(Inventory inventory) {
        InventoryEntity inventory1 = mapper.map(inventory, InventoryEntity.class);
        repository.save(inventory1);
    }

    public Inventory findByProductId(Long productId) {
        InventoryEntity inventoryEntity = repository.findByProductId(productId);
        if (inventoryEntity == null) {
            throw new CustomizeException("not found");
        }
        return mapper.map(inventoryEntity, Inventory.class);
    }

    public void updateInventory(Inventory inventory) {
        InventoryEntity inventoryEntity = mapper.map(inventory, InventoryEntity.class);
        repository.save(inventoryEntity);
    }

}