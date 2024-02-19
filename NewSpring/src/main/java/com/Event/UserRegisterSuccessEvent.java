package com.Event;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
public class UserRegisterSuccessEvent extends AbstractEvent{

    private String userName;

    public UserRegisterSuccessEvent(Object source, String userName) {
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
