package com.AspectJTest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
@Aspect
public class Aspect1 {
    //定义一个切入点 ,匹配Service1中的所有方法
    @Pointcut("execution(* com.AspectJTest.Service1.*(..))")
    public void pointcut1(){

    }
    //定义一个前置通知，这个通知对刚刚上面我们定义的切入点中所有的方法有效
    @Before(value = "pointcut1()")
    public void before(JoinPoint joinPoint){
        //输出连接点的信息
        System.out.println("前置通知："+joinPoint);
    }
    @After(value = "pointcut1()")
    public void after(JoinPoint joinPoint){
        System.out.println("后置通知："+joinPoint);
    }
    @AfterThrowing(value = "pointcut1()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        System.out.println("异常通知："+joinPoint);
        System.out.println("异常类型："+e);
    }
}
