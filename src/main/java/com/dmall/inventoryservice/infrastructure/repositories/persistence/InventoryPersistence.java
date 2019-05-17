package com.dmall.inventoryservice.infrastructure.repositories.persistence;

import com.dmall.inventoryservice.infrastructure.repositories.entity.InventoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryPersistence extends CrudRepository<InventoryEntity, Long> {
    InventoryEntity findByProductId(Long id);
}
