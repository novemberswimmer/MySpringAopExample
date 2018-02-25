package com.ruel;

import org.aspectj.lang.JoinPoint;
import org.junit.Test;
import org.mockito.Mockito;

public class BusinessAspectTest {

    private BusinessAspect aspect = new BusinessAspect();
    private JoinPoint mockJoinPoint = Mockito.mock(JoinPoint.class, Mockito.RETURNS_DEEP_STUBS);
    @Test
    public void testBusinessClassMethodPointCut(){
        aspect.methodPointCut();
    }

    @Test
    public void testBusinessAspectBeforeAdvice(){
        aspect.beforeAdvice(mockJoinPoint);
    }
}
