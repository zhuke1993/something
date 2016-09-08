package com.zhuke.something.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by ZHUKE on 2016/9/8.
 */
@Aspect
@Component
public class AOPDemo {
    @Before("execution(* com.zhuke.something.aop.RealObject.doSomething(..))")
    public void testAspect() {
        System.out.println("hahaha");
    }
}
