package com.lck.dao;

import com.lck.entity.User;

/***
 #Create by LCK on 2022/1/9  10:27
 */
public interface UserDao {

    public User select(Integer id);

    public void add(User user);

    void update(User user);

    void delete(Integer id);
}
