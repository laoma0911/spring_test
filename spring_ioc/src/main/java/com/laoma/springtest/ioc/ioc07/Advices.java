package com.laoma.springtest.ioc.ioc07;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advices {
    @Pointcut("execution(* com.laoma.springtest.ioc.ioc07.Math.*(..))")
    public void aspect() {
    }

    @Before("aspect()")
    public void before(JoinPoint joinPoint) {
        System.out.println("--------------------前置通知--------------------");
    }

    @After("aspect()")
    public void after() {
        System.out.println("--------------------最终通知--------------------");
    }
}
