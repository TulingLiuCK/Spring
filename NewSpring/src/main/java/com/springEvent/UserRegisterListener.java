package com.springEvent;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
@Component
public class UserRegisterListener {
    @EventListener
    @Order(0)
    public void sendEmail(UserRegisterEvent event){
        System.out.println(String.format("给用户[%s]发送注册成功通知", event.getUserName()));
    }
    @EventListener
    @Order(1)
    public void sendCompon(UserRegisterEvent event){
        System.out.println(String.format("给用户[%s]发放优惠券", event.getUserName()));
    }
}
