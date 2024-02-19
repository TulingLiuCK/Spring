package com.AccountTest;

import org.junit.Test;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
public class aTest {
    @Test
    public void test1(){
        //代理工厂
        ProxyFactory proxyFactory = new ProxyFactory(new FundsService());
        //添加一个前置通知方法，判断用户名是不是路人，若不是，抛出非法用户异常
        proxyFactory.addAdvice(new MethodBeforeAdvice() {
            @Override
            public void before(Method method, Object[] args, Object target) throws Throwable {
                String userName = (String) args[0];
                //如果不是路人，抛出非法访问异常
                if (!"路人".equals(userName)){
                    throw new RuntimeException("非法访问异常");
                }
            }
        });
        //通过代理工厂创建代理
        FundsService proxy = (FundsService) proxyFactory.getProxy();
        proxy.recharge("路人", 100);
//        proxy.recharge("张学友", 1000);
        proxy.cashOut("路人", 600);
        proxy.getBalance("路人");

    }
    @Test
    public void test2(){
        ProxyFactory proxyFactory = new ProxyFactory(new FundsService());
        //添加一个异常通知
        proxyFactory.addAdvice(new SendMsgThrowsAdvice());
        //通过代理工厂创建代理
        FundsService proxy = (FundsService) proxyFactory.getProxy();
        proxy.cashOut("路人", 2000);

    }
}
