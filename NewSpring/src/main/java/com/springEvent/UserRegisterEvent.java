package com.springEvent;

import org.springframework.context.ApplicationEvent;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
public class UserRegisterEvent extends ApplicationEvent {
    private String userName;

    public UserRegisterEvent(Object source, String userName) {
        super(source);
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
