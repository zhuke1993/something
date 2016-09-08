package com.zhuke.something.aop;

import org.springframework.stereotype.Service;

/**
 * Created by ZHUKE on 2016/9/7.
 */
@Service
public class RealObject implements Interface {
    public void doSomething() {
        System.out.println("do something");
    }

    public void doSomethingElse(String arg) {
        System.out.println("something else " + arg);
    }
}
