package com.AccountTest;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import java.lang.reflect.Method;

/***
 #Create by LCK on 2022/9/5
 # 用法: 观看生成的代理对象的一些信息
 */
public class AopTest5 {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new FundsService());
        proxyFactory.addAdvisor(new DefaultPointcutAdvisor(new MethodBeforeAdvice() {
            @Override
            public void before(Method method, Object[] args, Object target) throws Throwable {
                System.out.println(method);
            }
        }));
        //创建代理对象
        Object proxy = proxyFactory.getProxy();
        System.out.println("代理对象的类型："+proxy.getClass());
        System.out.println("代理对象的父类："+proxy.getClass().getSuperclass());
        System.out.println("代理对象实现的接口：");
        for (Class<?> cf : proxy.getClass().getInterfaces()) {
            System.out.println(cf);
        }
    }
}
