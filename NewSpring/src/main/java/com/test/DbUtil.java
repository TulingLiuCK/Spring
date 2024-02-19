package com.test;

import java.util.HashMap;
import java.util.Map;

/***
 #Create by LCK on 2022/9/4
 # 用法:
 */
public class DbUtil {
    public static Map<String,Object> getMailInfoFromDb(){
        Map<String,Object> result = new HashMap<>();
        result.put("mail.host", "hahah");
        result.put("mail.username", "张三");
        result.put("mail.password", "123");
        return result;
    }
}
