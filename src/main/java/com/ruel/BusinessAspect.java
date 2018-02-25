package com.ruel;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BusinessAspect {

    @Pointcut("execution(* BusinessClass.*(..))")
    public void methodPointCut() {
    }

    @Before("methodPointCut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Print this line before executing any method of BusinessClass: " + joinPoint.getSignature());
    }
}
