package com.newAop;

import java.lang.reflect.Method;

/***
 #Create by LCK on 2022/9/5
 # 用法:方法调用的描述，在方法调用时提供给拦截器
 方法调用是一个连接点，可以被方法拦截器拦截
 */
public interface MethodInvocation  extends Invocation{
    /**
     * 返回正在被调用的方法，返回的是当前Method对象
     * 此时，效果同父类的AccessibleObject getStaticPart()
     */
    Method getMethod();
}
