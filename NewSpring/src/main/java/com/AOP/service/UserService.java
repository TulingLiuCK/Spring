package com.AOP.service;

import com.AOP.bean.User;

/***
 #Create by LCK on 2022/1/8  22:43
 */
public interface UserService {

    public void add(User user);

    public User getUser(Integer id);
}
