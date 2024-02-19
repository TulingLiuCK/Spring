package com.lck.service;

import com.lck.entity.User;

/***
 #Create by LCK on 2022/1/9  10:26
 */
public interface UserService {
    public User select(Integer id);

    public void add(User user);

    void update(User user);

    void delete(Integer id);
}
