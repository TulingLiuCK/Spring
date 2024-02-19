package com.zhujie.dao.impl;

import com.zhujie.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/***
 #Create by LCK on 2022/1/8  16:23
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save running....");
    }
}
