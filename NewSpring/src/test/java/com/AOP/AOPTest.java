package com.AOP;

import com.AOP.bean.User;
import com.AOP.service.UserService;
import com.javaConfig.IocJavaConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 #Create by LCK on 2022/1/8  22:54
 */
public class AOPTest {
    ApplicationContext ioc;
    @Before
    public void before(){
        ioc=new ClassPathXmlApplicationContext("ApplicationContext-zhujie.xml");
    }
    @Test
    public void test(){
        UserService bean = ioc.getBean(UserService.class);

        bean.add(new User(1,"张三"));
    }
}
