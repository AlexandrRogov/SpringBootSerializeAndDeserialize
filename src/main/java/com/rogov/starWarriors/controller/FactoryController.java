package com.rogov.starWarriors.controller;

import com.rogov.starWarriors.dto.Ship;
import com.rogov.starWarriors.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class FactoryController {

    private final FactoryService service;

    @Autowired
    public FactoryController(FactoryService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Ship createShip(@RequestBody String json) throws IOException {
        return service.createShip(json);
    }
}
