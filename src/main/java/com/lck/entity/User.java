package com.lck.entity;

/***
 #Create by LCK on 2021/12/18  15:10
 */
public class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
