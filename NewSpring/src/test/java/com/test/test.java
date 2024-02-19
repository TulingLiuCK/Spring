package com.test;

import com.Event.MainConfig0;
import com.Event.UserRegisterService;
import com.dongtaiRefresh.BeanRefreshScope;
import com.dongtaiRefresh.MailService;
import com.dongtaiRefresh.MainConfig4;
import com.dongtaiRefresh.RefreshConfigUtil;
import com.springEvent.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.MapPropertySource;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/***
 #Create by LCK on 2022/9/4
 # 用法:
 */
public class test {
    @Test
    public void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //模拟从db中获取配置信息
        Map<String, Object> mailInfoFromDb = DbUtil.getMailInfoFromDb();
        //将其丢在MapPropertySource中(MapPropertySource类是Spring提供的一个类，是PropertySource的子类）
        MapPropertySource mailPropertySource = new MapPropertySource("mail", mailInfoFromDb);
        //将mailPropertySource丢在Environment中的PropertySouce类表中第一个中，让优先级最高
        context.getEnvironment().getPropertySources().addFirst(mailPropertySource);

        context.register(MailConfig2.class);
        context.refresh();
        MailConfig bean = context.getBean(MailConfig.class);

        System.out.println(bean);
    }

    @Test
    public void test3() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getBeanFactory().registerScope(BeanRefreshScope.SCOPE_REFRESH, BeanRefreshScope.getInstance());
        context.register(MainConfig4.class);
        //刷新mail的配置到Environment
        RefreshConfigUtil.refreshMailPropertySource(context);
        context.refresh();

        MailService mailService = context.getBean(MailService.class);
        System.out.println("配置未更新的情况，输出三次");
        for (int i = 0; i < 3; i++) {
            System.out.println(mailService);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("模拟更新");
        for (int i = 0; i < 3; i++) {
            RefreshConfigUtil.updateDbConfig(context);
            System.out.println(mailService);
        }

    }

    @Test
    public void test4 () {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig0.class);
        UserRegisterService userRegisterService = context.getBean(UserRegisterService.class);
        userRegisterService.registerUser("张三");
    }
    @Test
    public void test5(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig2.class);
        context.refresh();
        //获取用户注册服务
        com.springEvent.UserRegisterService userRegisterService = context.getBean(com.springEvent.UserRegisterService.class);

        userRegisterService.registerUser("路人甲");
    }

}
