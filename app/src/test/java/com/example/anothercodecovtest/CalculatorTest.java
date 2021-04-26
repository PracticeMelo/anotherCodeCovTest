package com.example.anothercodecovtest;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testSumCorrect(){
        Calculator calc = new Calculator();
        int sum = calc.addTwo(3,4);
        assertEquals(sum, 7);
    }

    @Test
    public void testMultiplication(){
        Calculator cal = new Calculator();
        int mul = cal.multiply(3, 4);
        assertEquals(mul, 12);
    }
}
