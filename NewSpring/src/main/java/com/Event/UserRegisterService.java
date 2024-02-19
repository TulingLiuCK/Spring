package com.Event;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
public class UserRegisterService {
    private EventMulticaster eventMulticaster;

    public void registerUser(String userName){
        System.out.println(String.format("用户【%s】注册成功", userName));
        this.eventMulticaster.multicastEvent(new UserRegisterSuccessEvent(this,userName));
    }

    public EventMulticaster getEventMulticaster(){
        return eventMulticaster;
    }

    public void setEventMulticaster(EventMulticaster eventMulticaster) {
        this.eventMulticaster = eventMulticaster;
    }
}
