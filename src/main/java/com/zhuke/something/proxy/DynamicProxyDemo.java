package com.zhuke.something.proxy;

/**
 * Created by ZHUKE on 2016/9/7.
 */
public class DynamicProxyDemo {
    public static void main(String[] args) {
        Interface userService= new SimpleProxy(new RealObject());
        DynamicInvocationHandler invocationHandler = new DynamicInvocationHandler(userService);
        Interface proxy = (Interface) invocationHandler.getProxy();
        proxy.doSomething();
    }
}
