package com.lck.dao.impl;

import com.lck.bean.User;
import com.lck.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/***
 #Create by LCK on 2022/1/8  14:40
 */
public class UserDaoImpl implements UserDao {
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;
    private String username;
    private int age;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建");
    }

    public void init() {
        System.out.println("初始化方法");
    }

    public void destory() {
        System.out.println("销毁方法");
    }

    @Override
    public void save() {
//        System.out.println(username);
//        System.out.println(age);
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running.....");
    }
}
