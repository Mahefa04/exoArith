package com.app.arith.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddServiceTest {
    private final AddService addService = new AddService();

    @Test
    public void should_add_two_positive_number() {
        int result = addService.add(5, 3);

        assertEquals(8, result);
    }
    @Test
    public void should_throw_exception_when_a_or_b_is_negative() {
        IllegalArgumentException exception=
                assertThrows(
                        IllegalArgumentException.class,
                        () -> addService.add(-5, 2));
        assertEquals("a and b should be positive", exception.getMessage());
    }
}
