package com.duoc.LearningPlatform.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.duoc.LearningPlatform.service.*.*(..))")
    public void logAntesDeMetodo(JoinPoint joinPoint) {
        System.out.println("Ejecutando método: " + joinPoint.getSignature().getName());
    }
}