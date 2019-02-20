package com.java1824.spring.demo2;

public class UserDAOImpl implements UserDAO {
    @Override
    public void addUser() {
        System.out.println("添加");
    }

    @Override
    public void removeUser() {
        System.out.println("移除");
    }
}
