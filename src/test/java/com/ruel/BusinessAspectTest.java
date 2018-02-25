package com.ruel;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.Test;
import org.mockito.Mockito;

public class BusinessAspectTest {

    private BusinessAspect aspect = new BusinessAspect();
    private JoinPoint mockJoinPoint = Mockito.mock(JoinPoint.class, Mockito.RETURNS_DEEP_STUBS);
    @Test
    public void testBusinessClassBeforePointCut(){
        aspect.beforePointCut();
    }

    @Test
    public void testBusinessAspectBeforeAdvice(){
        aspect.beforeAdvice(mockJoinPoint);
    }

    @Test
    public void testBusinessAspectAfterPointCut() {
        aspect.afterPointCut();
    }
    @Test
    public void testBusinessAspectAfterAdvice() {
        aspect.afterAdvice(mockJoinPoint);
    }

    @Test
    public void testBusinessAspectAfterReturningPointCut(){
        aspect.afterReturningPointCut();
    }

    @Test
    public void testBusinessAspectAfterReturningAdvice(){
        aspect.afterRetuningAdvice(mockJoinPoint, 2);
    }

    @Test
    public void testBusinessAspectAroundPointCut(){
        aspect.aroundPointCut();
    }

    @Test
    public void testBusinessAspectAroundAdvice() throws Throwable {
        aspect.aroundAdvice(Mockito.any(ProceedingJoinPoint.class));
    }
}
