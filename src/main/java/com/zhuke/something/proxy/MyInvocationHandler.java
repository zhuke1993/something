package com.zhuke.something.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by ZHUKE on 2016/9/7.
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;//目标对象

    public MyInvocationHandler(Object o) {
        super();
        this.target = o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----before invocation handler invoke.");

        Object invoke = method.invoke(target, args);

        System.out.println("----after invocation handler invoke.");

        return invoke;
    }

    /**
     * 获取目标对象的代理对象
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }
}
