package com.java1824.spring.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StuTest {
    @Autowired
    @Qualifier("stu")
    private Student studentDao;
    @Test
    public void stuT(){
           studentDao.add();
           studentDao.remove();
    }
}
