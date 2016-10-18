package com.zhuke.something.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by ZHUKE on 2016/9/12.
 */
public class EnhancerDemo {

    public static void main(String[] args) {

        /*Enhancer可以根据被代理的类，动态地创建子类，并且过滤该子类的所有方法
        * 和JDK的Proxy不同，该类可以工作在接口和非接口类下*/
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(EnhancerDemo.class);
        /*该方法不能代理static & final方法*//*
        enhancer.setCallback(new FixedValue() {
            //所有方法返回修正后的返回值
            public Object loadObject() throws Exception {
                return "Hello cglib!";
            }
        });*/

        /*enhancer.setCallback(new InvocationHandler() {
            *//*InvocationHandler可以实现对调用方法的更细致的选择和判断，进一步实现代理方法*//*
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getDeclaringClass() != Object.class && method.getReturnType() == String.class) {
                    return "Hello cglib!";
                } else {
                    throw new RuntimeException("Do not know what to do.");
                }
            }
        });*/

        enhancer.setCallback(new MethodInterceptor() {
            /*实现对方法的代理过滤*/
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
                    throws Throwable {
                if (method.getDeclaringClass() != Object.class && method.getReturnType() == String.class) {
                    return "Hello cglib!";
                } else {
                    return proxy.invokeSuper(obj, args);
                }
            }
        });

        EnhancerDemo proxy = (EnhancerDemo) enhancer.create();
        System.out.println(proxy.test(null));
        proxy.test1();
        System.out.println(proxy.getClass());
        proxy.hashCode();
    }

    public String test(String input) {
        return "Hello world!";
    }

    public void test1() {
        System.out.println("Hello world!");
    }
}
