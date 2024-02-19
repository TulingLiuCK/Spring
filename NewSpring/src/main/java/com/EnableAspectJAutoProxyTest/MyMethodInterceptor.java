package com.EnableAspectJAutoProxyTest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
public class MyMethodInterceptor implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("我是MethodInterceptor start");
        Object result = invocation.proceed();
        System.out.println("我是MethodInterceptor end");
        return result;
    }
}
