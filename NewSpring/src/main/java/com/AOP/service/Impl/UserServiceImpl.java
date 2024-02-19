package com.AOP.service.Impl;

import com.AOP.bean.User;
import com.AOP.dao.UserDao;
import com.AOP.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 #Create by LCK on 2022/1/8  22:44
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public void add(User user) {
        System.out.println("添加");
        int i = 10/0;
        System.out.println(user);

    }

    @Override
    public User getUser(Integer id) {
        System.out.println("查询user");
        return userDao.getUser(id);
    }
}
