package com.lck.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/1/9  10:37
 */
@Aspect //标记为切面
@Component  //标记bean组件
public class LogAspect {
    //前置通知
    @Before("execution(* com.lck.service.impl..*.*(..))")
    public void before(){
        System.out.println("前置通知");
    }
    //后置通知
    @After("execution(* com.lck.service.impl..*.*(..))")
    public void after(){
        System.out.println("后置通知");
    }
    //后置异常通知
    @AfterThrowing("execution(* com.lck.service.impl..*.*(..))")
    public void afterThorwing(){
        System.out.println("后置异常通知");
    }
    //后置返回通知
    @AfterReturning("execution(* com.lck.service.impl..*.*(..))")
    public void afterReturning(){
        System.out.println("后置返回通知");
    }
    //环绕

}
