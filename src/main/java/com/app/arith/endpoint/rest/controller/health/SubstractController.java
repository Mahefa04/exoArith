package com.app.arith.endpoint.rest.controller.health;

import com.app.arith.service.SubstractService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubstractController {
    public final SubstractService substractService;

    public SubstractController(SubstractService substractService) {
        this.substractService = substractService;
    }

    @GetMapping("/substract")
    public int substract(@RequestParam int a, @RequestParam int b) {
        return substractService.substract(a, b);
    }
}
