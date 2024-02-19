package com.EnableAspectJAutoProxyTest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
@Component
@Aspect
public class Aspect1 {
    private static Logger logger = LoggerFactory.getLogger(Aspect1.class);

    @Pointcut("execution(* com.EnableAspectJAutoProxyTest..*(..))") //定义切入点
    public void pc(){

    }
    @Before(value = "com.EnableAspectJAutoProxyTest.Aspect1.pc()") //定义一个前置通知
    public void before(JoinPoint joinPoint){
        System.out.println("我是前置通知，target:"+joinPoint.getTarget());//输出一行日志
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setAdvice(new MyMethodBeforeAdvice());
//        System.out.println(advisor.toString());
    }
}
