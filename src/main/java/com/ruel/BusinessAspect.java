package com.ruel;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class BusinessAspect {

    @Pointcut("execution(* BusinessClass.p*(..))")
    public void beforePointCut() {
    }

    @Pointcut("execution(* BusinessClass.add(..))")
    public void afterPointCut() {
    }

    @Pointcut("execution(* BusinessClass.subtract(..))")
    public void afterReturningPointCut() {
    }

    @Pointcut("execution(* BusinessClass.multiply(..))")
    public void aroundPointCut() {
    }


    @Before("beforePointCut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Print this line before executing any method of BusinessClass: " + joinPoint.getSignature());
    }

    @After("afterPointCut()")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("Print this line after executing add method of BusinessClass: " + joinPoint.getSignature());
    }

    @AfterReturning(
            pointcut = "afterReturningPointCut()",
            returning = "result"
    )
    public void afterRetuningAdvice(JoinPoint joinPoint, Object result) {
        System.out.println("Print this line after returning the value of subtract method: " + joinPoint.getSignature());
        System.out.println("This advice have access to return value: " + result);
    }

    @Around("aroundPointCut()")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Execute this concern before executing the method");
        //You need to return an object
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("Execute this concern after executing the method");
        return obj;
    }
}