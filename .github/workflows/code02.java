// src/test/java/com/example/CalculatorTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    
    private Calculator calculator = new Calculator();
    
    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }
    
    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }
    
    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
    }
    
    @Test
    void testDivide() {
        assertEquals(3, calculator.divide(15, 5));
    }
    
    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}