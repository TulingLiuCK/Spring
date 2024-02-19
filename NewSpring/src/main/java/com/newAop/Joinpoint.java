package com.newAop;

import java.lang.reflect.AccessibleObject;

/***
 #Create by LCK on 2022/9/5
 # 用法: 连接点
 */
public interface Joinpoint {
    /**
     * 转到拦截器链中的下一个拦截器
     */
    Object proceed() throws Throwable;

    /**
     * 返回保存当前连接点静态部分的对象，这里一般指被代理的目标
     */
    Object getThis();

    /**
     * 返回此静态连接点，一般就为当前的Method（至少目前的唯一实现是MethodInvocation，所以连接点得静态部分肯定就是本方法）
     */
    AccessibleObject getStaticPart();
}

