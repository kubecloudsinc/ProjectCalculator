package com.tests;

import com.examples.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAddition {

    Calculator aCalculator;
    @BeforeTest
    public void setUp(){
        aCalculator = new Calculator();

    }
    @Test
    public void testAddTwoPositiveNumbers(){
        Assert.assertEquals(aCalculator.add(5,3), 8);
    }
}
