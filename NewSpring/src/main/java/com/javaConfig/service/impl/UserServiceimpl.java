package com.javaConfig.service.impl;

import com.javaConfig.dao.UserDao;
import com.javaConfig.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 #Create by LCK on 2022/1/8  16:24
 */

@Service
public class UserServiceimpl implements UserService {


    //    @Qualifier("userDao") //按照id值从容器中进行匹配
    @Autowired
    private UserDao userDao;


    @Override
    public void save() {
        userDao.save();
    }
}
