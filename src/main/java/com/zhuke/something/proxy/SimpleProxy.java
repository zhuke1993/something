package com.zhuke.something.proxy;

/**
 * Created by ZHUKE on 2016/9/7.
 */
public class SimpleProxy implements Interface {
    private Interface proxied;//被代理的对象

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    public void doSomething() {
        System.out.println("simple proxy do something");
        proxied.doSomething();//在被代理对象执行方法之前可以执行代理的动作
    }

    public void doSomethingElse(String arg) {
        System.out.println("simple proxy do something else " + arg);
        proxied.doSomethingElse(arg);
    }
}
