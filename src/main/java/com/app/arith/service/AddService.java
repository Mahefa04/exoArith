package com.app.arith.service;

import org.springframework.stereotype.Service;

@Service
public class AddService {
    
    public int add(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a and b should be positive");
        }
        return a + b;
    }
}
