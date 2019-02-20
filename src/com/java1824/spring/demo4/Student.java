package com.java1824.spring.demo4;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("stu")
@Aspect
public class Student {
    public void add(){
        System.out.println("添加学生");
    }
    public void remove(){
        System.out.println("删除学生");
    }
}
