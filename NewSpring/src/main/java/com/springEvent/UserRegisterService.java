package com.springEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
@Component
public class UserRegisterService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    private Logger logger = LoggerFactory.getLogger(UserRegisterService.class);


    /**
     * 负责用户注册及发布事件的功能
     */
    public void registerUser(String userName){
        //用户注册
        logger.debug("发送消息成功");
        System.out.println(String.format("用户[%s]注册成功", userName));
        //发送注册成功事件
        this.applicationEventPublisher.publishEvent(new UserRegisterEvent(this,userName));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
