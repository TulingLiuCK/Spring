package com.AOP.dao;

import com.AOP.bean.User;

/***
 #Create by LCK on 2022/1/8  22:39
 */
public interface UserDao {
    public void add(User user);

    public User getUser(Integer id);
}
