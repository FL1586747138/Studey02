package com.java1824.spring.demo4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component("stuAdvice")
public class StudentAdvice {
    @Before("execution(* com.java1824.spring.demo4.Student.add(..))")
    public void addActive(){
        System.out.println("增强代码");
    }
}
