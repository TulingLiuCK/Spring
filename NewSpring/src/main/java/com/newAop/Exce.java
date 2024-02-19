package com.newAop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
public class Exce implements ThrowsAdvice {
    public void afterThrowing(Method method,Object[] args,Object target,ArithmeticException ta){
        System.out.println("Exception happened"+ta+"and was thrown in "+method);
    }

}
