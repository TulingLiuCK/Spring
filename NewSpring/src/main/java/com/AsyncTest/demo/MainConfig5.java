package com.AsyncTest.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
@ComponentScan
@EnableAsync
public class MainConfig5 {
    //业务线程池bean名称
    public static final String RECHARGE_EXECUTORS_BEAN_NAME = "recharegeExecutors";
    //提现业务线程池
    public static final String CASHOUT_EXECUTORS_BEAN_NAME= "cashOutExecutors";

    /**
     * 充值的线程池
     */
    @Bean(RECHARGE_EXECUTORS_BEAN_NAME)
    public Executor rechargeExecutors(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(100);
        //线程名称前缀
        executor.setThreadNamePrefix("recharge-thread-");
        return executor;
    }
    /**
     * 提现的线程池
     */
    @Bean(CASHOUT_EXECUTORS_BEAN_NAME)
    public Executor cashOutExecutors(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(100);
        executor.setThreadNamePrefix("cashOut-thread-");
        return executor;
    }
}
