package com.ScheDuTest;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/9/6
 # 用法: 定时器任务
 */
@Component
public class PushJob {
    //推送方法，每秒执行一次
    @Scheduled(fixedRate = 1000)
    public void push(){
        System.out.println("模拟推送消息："+System.currentTimeMillis());
    }
}
