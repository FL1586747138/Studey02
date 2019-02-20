package com.java1824.spring.demo2;

import org.junit.Test;

public class Test1 {
    @Test
     public void testUser(){
        UserDAOImpl userDAO=new UserDAOImpl();
        UserPoxy poxy=new UserPoxy(userDAO);
        UserDAOImpl build = poxy.build();
        build.addUser();
    }
}
