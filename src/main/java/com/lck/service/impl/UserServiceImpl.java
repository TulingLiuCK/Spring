package com.lck.service.impl;

import com.lck.dao.UserDao;
import com.lck.dao.impl.UserDaoImpl;
import com.lck.dao.impl.UserMyImpl;
import com.lck.service.UserService;

/***
 #Create by LCK on 2021/12/18  13:55
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
