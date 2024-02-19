package com.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
@Configuration
@ComponentScan
public class MainConfig0 {
    @Bean
    @Autowired(required = false)
    public EventMulticaster eventMulticaster(List<EventListener> eventListeners) {
        EventMulticaster eventPublisher = new SimpleEventMulticaster();
        if (eventListeners != null) {
            eventListeners.forEach(eventPublisher::addEventListener);
        }
        return eventPublisher;
    }

    @Bean
    public UserRegisterService userRegisterService(EventMulticaster eventMulticaster) { //@2
        UserRegisterService userRegisterService = new UserRegisterService();
        userRegisterService.setEventMulticaster(eventMulticaster);
        return userRegisterService;
    }
}
