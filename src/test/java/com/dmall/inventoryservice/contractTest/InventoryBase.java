package com.dmall.inventoryservice.contractTest;

import com.dmall.inventoryservice.apis.InventoryController;
import com.dmall.inventoryservice.applications.InventoryService;
import com.dmall.inventoryservice.domain.Inventory;
import com.dmall.inventoryservice.domain.InventoryLock;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

public class InventoryBase {

    @Before
    public void setup() {
        final InventoryService inventoryService = mock(InventoryService.class);
        doNothing().when(inventoryService).save(any(Inventory.class));
        doNothing().when(inventoryService).unlock(any(Long.class));
        RestAssuredMockMvc.standaloneSetup(new InventoryController(inventoryService));
    }

}
