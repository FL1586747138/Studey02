package com.java1824.spring.demo3;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AAdvice  implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置增强");
    }
}
