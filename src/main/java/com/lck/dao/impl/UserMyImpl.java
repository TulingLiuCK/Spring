package com.lck.dao.impl;

import com.lck.dao.UserDao;

/***
 #Create by LCK on 2021/12/18  13:56
 */
public class UserMyImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取自己");
    }
}
