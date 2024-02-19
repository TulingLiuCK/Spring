package com.Event;

import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
@Component
public class SendEmailOnUserRegisterSuccessListener implements EventListener<UserRegisterSuccessEvent>{
    @Override
    public void onEvent(UserRegisterSuccessEvent event) {
        System.out.println(String.format("给用户【%s】发送注册邮件成功", event.getUserName()));
    }
}
