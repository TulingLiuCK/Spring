package com.lck.dao.impl;

import com.lck.dao.UserDao;
import com.lck.entity.User;
import org.springframework.stereotype.Repository;

/***
 #Create by LCK on 2022/1/9  10:28
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User select(Integer id) {
        if (id==null){
            throw  new NullPointerException();
        }
        return new User();
    }

    @Override
    public void add(User user) {
        if (user==null){
            throw  new NullPointerException();
        }
    }

    @Override
    public void update(User user) {
        if (user==null){
            throw  new NullPointerException();
        }
    }

    @Override
    public void delete(Integer id) {
        if (id==null){
            throw  new NullPointerException();
        }
    }
}
