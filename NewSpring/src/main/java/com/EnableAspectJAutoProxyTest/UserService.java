package com.EnableAspectJAutoProxyTest;

import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
@Component
public class UserService {
    public void say(){
        System.out.println("我是UserService");
    }
}
