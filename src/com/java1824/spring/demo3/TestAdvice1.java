package com.java1824.spring.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAdvice1 {
    @Autowired
    @Qualifier("aDaopoxy")
     ADAO dao;
    @Test
    public void testAdvice(){
        dao.add();
        System.out.println("--------------------------");
        dao.romove();
    }
}
