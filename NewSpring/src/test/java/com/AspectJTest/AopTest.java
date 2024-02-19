package com.AspectJTest;

import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
public class AopTest {
    @Test
    public void test1(){
        Service1 service1 = new Service1();
        AspectJProxyFactory proxyFactory = new AspectJProxyFactory();
        //设置被代理的对象
        proxyFactory.setTarget(service1);
        //设置标注了@Aspect注解的类
        proxyFactory.addAspect(Aspect1.class);
        //生成代理对象
        Service1 proxy = proxyFactory.getProxy();
        proxy.m1();
        proxy.m2();
    }
}
