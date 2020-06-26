package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;
    @Before
    public void init()
    {
        calculator=new Calculator();
    }

    @Test
    public void testAddTwoNumbers()
    {
        Assert.assertEquals(5,calculator.addTwoNumbers(2,3));
    }
    @After
    public  void destroyed()
    {
        calculator=null;
    }


}
