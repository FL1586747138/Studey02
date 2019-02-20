package com.java1824.spring.demo1;

import org.springframework.stereotype.Component;

@Component("hello")
public class SpringHello {
       public void sayHello(){
           System.out.println("hello");
       }

}
