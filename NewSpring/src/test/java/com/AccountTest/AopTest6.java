package com.AccountTest;

import com.AccountTest.service.IService;
import com.AccountTest.service.impl.Service;
import org.junit.Test;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
public class AopTest6 {
    @Test
    public void test1(){
        Service service = new Service();
        ProxyFactory proxyFactory = new ProxyFactory();
        //设置需要被代理的对象
        proxyFactory.setTarget(service);
        //设置需要代理的接口
        proxyFactory.addInterface(IService.class);
        //强制使用cglib代理
//        proxyFactory.setProxyTargetClass(true);

        proxyFactory.addAdvice(new MethodBeforeAdvice() {
            @Override
            public void before(Method method, Object[] args, Object target) throws Throwable {
                System.out.println(method);
            }
        });
        IService proxy = (IService) proxyFactory.getProxy();
        System.out.println("代理对象的类型："+proxy.getClass());
        System.out.println("代理对象的父类："+proxy.getClass().getSuperclass());
        System.out.println("代理对象实现的接口列表");
        for (Class<?> cf : proxy.getClass().getInterfaces()) {
            System.out.println(cf);
        }
        //调用代理的方法
        System.out.println("调用代理对象的方法");
        proxy.say("哈哈");
    }
}
