package com.AsyncTest.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
@Component
public class CashOutService {
    //模拟异步提现
    @Async(MainConfig5.CASHOUT_EXECUTORS_BEAN_NAME)
    public void cashOut(){
        System.out.println(Thread.currentThread()+"模拟异步提现");
    }
}
