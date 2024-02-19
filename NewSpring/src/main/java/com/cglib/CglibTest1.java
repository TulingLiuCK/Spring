package com.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
public class CglibTest1 {
    interface IService1{
        void m1();
    }
    interface IService2{
        void m2();
    }
    public static void main(String[] args){
        Enhancer enhancer = new Enhancer();
        //设置代理对象需要实现的接口
        enhancer.setInterfaces(new Class[]{IService1.class,IService2.class});
        //通过callback来对被代理对象继续增强
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("方法："+method.getName());
                return null;

            }
        });
        Object proxy = enhancer.create();
        if (proxy instanceof IService1){
            ((IService1) proxy).m1();
        }
        if (proxy instanceof IService2){
            ((IService2) proxy).m2();
        }
        //看一下代理对象的类型
        System.out.println(proxy.getClass());
        //看一下代理实现的接口
        System.out.println("接口实现如下：");
        for (Class<?> anInterface : proxy.getClass().getInterfaces()) {
            System.out.println(anInterface);
        }
    }
}
