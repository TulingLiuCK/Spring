package com.AOP;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/***
 #Create by LCK on 2022/1/8  22:36
 */
@Aspect
@Component
public class LogUtil {
    @Before("execution(* com.AOP.service..*.*(..))")
    public static void befor() {
//        System.out.println(method.getName() + "方法运行前，参数是：" +
//                (args == null ? "" : Arrays.asList(args).toString()));
        System.out.println("方法前");
    }

    @After("execution(* com.AOP.service..*.*(..))")
    public static void after() {
//        System.out.println(method.getName() + "方法运行后，参数是：" +
//                (args == null ? "" : Arrays.asList(args).toString()));
        System.out.println("方法后");
    }
    @AfterThrowing("execution(* com.AOP.service..*.*(..))")
    public static void afterException() {
//        System.out.println("方法报错了：" + ex.getMessage());
        System.out.println("方法异常");
    }
    @AfterReturning("execution(* com.AOP.service..*.*(..))")
    public static  void afterEnd(){
        System.out.println("方法返回");
    }
}
