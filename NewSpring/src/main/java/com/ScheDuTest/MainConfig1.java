package com.ScheDuTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.*;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
@ComponentScan
@EnableScheduling // 在spring容器中启动定时任务的执行
public class MainConfig1 {

//    //线程池
//    public static ExecutorService newFixedThreadPool(){
//        return new ThreadPoolExecutor(0,Integer.MAX_VALUE,60L, TimeUnit.SECONDS,new SynchronousQueue<>());
//    }

    @Bean
    public ScheduledExecutorService scheduledExecutorService(){
        return Executors.newScheduledThreadPool(20);
    }
}
