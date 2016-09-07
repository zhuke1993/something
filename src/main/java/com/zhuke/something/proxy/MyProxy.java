package com.zhuke.something.proxy;

/**
 * Created by ZHUKE on 2016/9/7.
 */
public class MyProxy {
    public static void main(String[] args) {
        UserServiceImpl userService= new UserServiceImpl();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
        UserService proxy = (UserService) invocationHandler.getProxy();
        proxy.save();
    }
}
