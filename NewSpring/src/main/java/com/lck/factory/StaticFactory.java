package com.lck.factory;

import com.lck.dao.UserDao;
import com.lck.dao.impl.UserDaoImpl;

/***
 #Create by LCK on 2022/1/8  15:00
 */
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
