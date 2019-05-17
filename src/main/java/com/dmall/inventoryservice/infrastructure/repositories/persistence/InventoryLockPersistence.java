package com.dmall.inventoryservice.infrastructure.repositories.persistence;

import com.dmall.inventoryservice.infrastructure.repositories.entity.InventoryLockEntity;
import org.springframework.data.repository.CrudRepository;

public interface InventoryLockPersistence extends CrudRepository<InventoryLockEntity, Long> {
}
