package com.ruel;

import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.times;


public class BusinessClassTest {

    private BusinessClass businessClass = new BusinessClass();

    @Test
    public  void testBusinessClassPrintStringMethod(){
        businessClass.printString("Hello World!!");
    }

    @Test
    public void testBusinessClassAddMethod(){
        assertNotNull(businessClass.add(1, 2));
    }

}
