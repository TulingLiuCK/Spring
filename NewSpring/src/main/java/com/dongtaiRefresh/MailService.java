package com.dongtaiRefresh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/9/4
 # 用法:
 */
@Component
public class MailService {
    @Autowired
    private MailConfig mailConfig;

    @Override
    public String toString() {
        return "MailService{" +
                "mailConfig=" + mailConfig +
                '}';
    }
}
