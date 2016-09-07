package com.zhuke.something.proxy;

/**
 * Created by ZHUKE on 2016/9/7.
 */
public class RealObject implements Interface {
    public void doSomething() {
        System.out.println("do something");
    }

    public void doSomethingElse(String arg) {
        System.out.println("something else " + arg);
    }
}
