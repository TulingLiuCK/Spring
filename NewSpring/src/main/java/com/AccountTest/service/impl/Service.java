package com.AccountTest.service.impl;

import com.AccountTest.service.IService;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
public class Service implements IService {
    @Override
    public void say(String name) {
        System.out.println("hello:"+name);
    }
}
