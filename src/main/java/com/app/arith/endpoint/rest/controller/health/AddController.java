package com.app.arith.endpoint.rest.controller.health;

import com.app.arith.service.AddService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
    
    public final AddService addService;

    public AddController(AddService addService) {
        this.addService = addService;
    }

    @GetMapping("/sum")
    public int add(@RequestParam int a, @RequestParam int b) throws IllegalAccessException {
        return addService.add(a,b);
    }
}
