package com.dmall.inventoryservice.apis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class BusTestController {

    @Value("${foo:null}")
    String foo;

    @GetMapping
    public String test() {
        return foo;
    }
}
