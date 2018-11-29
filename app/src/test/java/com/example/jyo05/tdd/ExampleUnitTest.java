package com.example.jyo05.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Calculator calculator;
    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void testCase1() {
        assertEquals(10, calculator.sum(8, 2));
    }

    @Test
    public void testCase2() {
        assertEquals(20, calculator.multiply(10, 2));
    }

}