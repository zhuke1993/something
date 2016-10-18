package com.zhuke.something.cglib;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ZHUKE on 2016/9/12.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        SampleClass sampleClass = new SampleClass();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            sampleClass.test(null);
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
        for (int i = 0; i < 90000000; i++) {
            Method method = SampleClass.class.getMethod("test", String.class);
            method.invoke(SampleClass.class.newInstance(), "zhuke");
        }
        long t3 = System.currentTimeMillis();
        System.out.println(t3 - t2);
    }
}
