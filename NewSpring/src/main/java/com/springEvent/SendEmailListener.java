package com.springEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */

public class SendEmailListener implements ApplicationListener<UserRegisterEvent> {
    @Override
    public void onApplicationEvent(UserRegisterEvent event) {
        System.out.println(String.format("给用户【%s】发送注册邮件成功", event.getUserName()));
    }
}
