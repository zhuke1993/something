package com.zhuke.something.proxy;

/**
 * Created by ZHUKE on 2016/9/7.
 */
public class SimpleProxyDemo {
    public static void main(String[] args) {
        Interface realObject = new RealObject();
        SimpleProxy simpleProxy = new SimpleProxy(realObject);
        simpleProxy.doSomething();
        simpleProxy.doSomethingElse("two birds on the tree.");
    }
}
