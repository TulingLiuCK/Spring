package com.dongtaiRefresh;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.env.MapPropertySource;

import java.util.Map;

/***
 #Create by LCK on 2022/9/4
 # 用法:
 */
public class RefreshConfigUtil {
    //模拟改变数据库的配置信息
    public static void updateDbConfig(AbstractApplicationContext context){
        //更新context的mailPropertySource配置信息
        refreshMailPropertySource(context);
        //清空BeanRefreshScope中所有Bean的缓存
        BeanRefreshScope.clean();
    }

    public static void refreshMailPropertySource(AbstractApplicationContext context) {
        Map<String,Object> mailInfoFromDb = DbUtil.getMailInfoFromDb();
        //将其丢在MapPropertyPSource中（MapPropertySource类是Spring提供的一个类，是PropertySource的子类）
        MapPropertySource mail = new MapPropertySource("mail", mailInfoFromDb);
        context.getEnvironment().getPropertySources().addFirst(mail);
    }
}
