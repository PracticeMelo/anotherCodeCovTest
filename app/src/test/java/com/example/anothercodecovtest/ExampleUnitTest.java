package com.example.anothercodecovtest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
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