package com.AsyncTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
@Configuration
public class AsyncConfig {
    @Bean
    public TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);        // 设置核心线程数
        executor.setMaxPoolSize(10);        // 设置最大线程数
        executor.setQueueCapacity(20);      // 设置队列容量
        executor.setKeepAliveSeconds(60);   // 设置线程活跃时间（秒）
        executor.setThreadNamePrefix("user-rpt-");  // 设置默认线程名称
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());  // 设置拒绝策略
        executor.setWaitForTasksToCompleteOnShutdown(true); // 等待所有任务结束后再关闭线程池
        return executor;
    }
}
