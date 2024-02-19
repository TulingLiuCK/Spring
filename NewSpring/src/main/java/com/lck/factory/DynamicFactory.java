package com.lck.factory;

import com.lck.dao.UserDao;
import com.lck.dao.impl.UserDaoImpl;

/***
 #Create by LCK on 2022/1/8  15:03
 */
public class DynamicFactory {
    public UserDao getUserDao(){
        return  new UserDaoImpl();
    }
}
