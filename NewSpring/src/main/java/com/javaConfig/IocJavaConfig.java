package com.javaConfig;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/***
 #Create by LCK on 2022/1/8  21:00
 */
@Configuration
@ComponentScan(basePackages = "com.javaConfig")
public class IocJavaConfig {
    @Bean
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setName("root");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/book?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }
}
