package com.EnableAspectJAutoProxyTest;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
public class AspectTest1 {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig1.class);
        context.refresh();
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setAdvice(new MyMethodBeforeAdvice());
        UserService userService = context.getBean(UserService.class);
        userService.say();
        CarService carService = context.getBean(CarService.class);
        carService.say();
    }
    @Test
    public void test2(){
        ProxyFactory proxyFactory = new ProxyFactory(new CarService());
        proxyFactory.addAdvice(new MyMethodBeforeAdvice());
        proxyFactory.addAdvice(new MyMethodInterceptor());
        CarService proxy = (CarService) proxyFactory.getProxy();
        proxy.say();
    }
}
