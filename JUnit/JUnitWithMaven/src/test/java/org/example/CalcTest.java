package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test
    public void Test(){
        Calc c = new Calc();
        int actual = c.divide(10, 2);
        int expectedResult = 5;
        assertEquals(expectedResult, actual);
    }
}

//the file doesn't allow me to run