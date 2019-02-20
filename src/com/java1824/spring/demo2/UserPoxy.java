package com.java1824.spring.demo2;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;


import java.lang.reflect.Method;

public class UserPoxy implements InvocationHandler {
    private UserDAOImpl user;

    public UserPoxy(UserDAOImpl user) {
        this.user = user;
    }
    public UserDAOImpl build(){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(user.getClass());
        enhancer.setCallback(this);
        UserDAOImpl o = (UserDAOImpl) enhancer.create();
        return o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("addUser".equals(method.getName())){
            System.out.println("写入日志");
        }
        return method.invoke(user,args);
    }
}
