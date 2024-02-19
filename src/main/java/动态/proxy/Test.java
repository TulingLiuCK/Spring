package 动态.proxy;

import 动态.rent.模板.ProxyInvocationHandler;

/***
 #Create by LCK on 2021/12/19  14:54
 */
public class Test {
    public static void main(String[] args) {
        //真实角色
        People people = new People();
        //代理角色：婚介所，不存在，动态代理
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //通过调用程序处理来处理我们要要调用的接口对象
        pih.setTarget(people);

        //处理代理对象
        jiehun proxy1 = (jiehun) pih.getProxy();

        proxy1.jiehun();

    }



}
