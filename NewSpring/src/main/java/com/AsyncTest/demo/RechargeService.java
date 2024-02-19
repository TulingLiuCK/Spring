package com.AsyncTest.demo;

import com.AsyncTest.MainConfig1;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
@Component
public class RechargeService {
    //模拟异步充值
    @Async(MainConfig5.RECHARGE_EXECUTORS_BEAN_NAME)
    public void recharge(){
        System.out.println(Thread.currentThread()+"模拟异步充值");
    }
}
