package com.AOP.dao.Impl;

import com.AOP.bean.User;
import com.AOP.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/***
 #Create by LCK on 2022/1/8  22:41
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserDao userDao;



    @Override
    public void add(User user) {
        userDao.add(user);
        System.out.println("添加user");
    }

    @Override
    public User getUser(Integer id) {
        System.out.println("查询user");
        return userDao.getUser(id);
    }
}
