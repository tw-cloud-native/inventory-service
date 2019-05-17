package com.dmall.inventoryservice.infrastructure.repositories.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "inventory_lock")
public class InventoryLockEntity {

    @Id
    @GeneratedValue
    Long id;

    @Column(name = "product_id")
    long productId;

    @Column(name = "quantity")
    int quantity;
}
