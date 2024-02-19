package com.dongtaiRefresh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/9/4
 # 用法:邮件配置信息
 */
@Component
@RefreshScope
public class MailConfig {
    @Value("${mail.username}")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "MailConfig{" +
                "username='" + username + '\'' +
                '}';
    }
}
