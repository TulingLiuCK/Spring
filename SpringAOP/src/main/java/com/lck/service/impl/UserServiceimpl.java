package com.lck.service.impl;

import com.lck.dao.UserDao;
import com.lck.entity.User;
import com.lck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 #Create by LCK on 2022/1/9  10:27
 */
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User select(Integer id) {
        System.out.println("查询用户");
        return userDao.select(id);
    }

    @Override
    public void add(User user) {
        System.out.println("添加用户");
        userDao.add(user);
    }

    @Override
    public void update(User user) {
        System.out.println("修改用户");
        userDao.update(user);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("删除用户");
        userDao.delete(id);
    }
}
