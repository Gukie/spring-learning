package com.lokia.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

@Configuration
@Aspect
public class AopTest {

    //    @Pointcut(value = "execution(* com.alibaba.campus.iengine.service.springtest.beans.TestBean2.*(..))")
    @Around("execution(* com.lokia.beans.TestBean2.*(..))")
    public void invokeTestBean2(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        String name =joinPoint.getTarget().getClass().getName()+"#"+ method.getName();
        System.out.println("*************************: "+ name+" starting...");
        joinPoint.proceed();
        System.out.println("*************************: "+ name+" ending...");
    }
}
