package com.lck.service.impl;

import com.lck.bean.User;
import com.lck.dao.UserDao;
import com.lck.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 #Create by LCK on 2022/1/8  15:08
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private User user;
    public UserServiceImpl() {
    }


    public UserServiceImpl(UserDao userDao, User user) {
        this.userDao = userDao;
        this.user = user;
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        User user = new User();
        userDao.save();
    }

}
