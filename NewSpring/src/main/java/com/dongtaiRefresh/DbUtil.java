package com.dongtaiRefresh;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/***
 #Create by LCK on 2022/9/4
 # 用法:
 */
public class DbUtil {
    public static Map<String,Object> getMailInfoFromDb(){
        Map<String,Object> result = new HashMap<>();
        result.put("mail.username", UUID.randomUUID().toString());
        return result;
    }
}
