package com.math;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        System.out.println("testAdd");
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(1, 4));  // expected, actual
    }

    @Test
    public void testDivide() {
        System.out.println("testDivide");
        Calculator calc = new Calculator();
        assertEquals(2.5, calc.divide(5, 2), .001);
    }

    @Test
    public void testIsEven() {
        System.out.println("testIsEven");
        Calculator calc = new Calculator();
        assertTrue(calc.isEven(10));
    }
}