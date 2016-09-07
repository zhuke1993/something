package com.zhuke.something.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by ZHUKE on 2016/9/7.
 */
public class DynamicInvocationHandler implements InvocationHandler {

    private Object proxied;//代理的目标对象

    public DynamicInvocationHandler(Object o) {
        super();
        this.proxied = o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*** proxy: " + proxy.getClass() + " ,method: " + method + ", args: " + args);
        return method.invoke(proxied, args);
    }

    /**
     * 获取目标对象的代理对象
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), proxied.getClass().getInterfaces(), this);
    }
}
