package com.newAop;

/***
 #Create by LCK on 2022/9/5
 # 用法: 此接口标识程序中的调用
 调用是一个连接点，可以被拦截器拦截
 */
public interface Invocation extends Joinpoint{

    /**
     * 将参数作为数组对象获取，可以更改此数组中的元素值以更改参数
     * 通常用来获取调用目标方法的参数
     */
    Object[] getArguments();
}
