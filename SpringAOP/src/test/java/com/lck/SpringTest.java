package com.lck;

import com.lck.entity.User;
import com.lck.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 #Create by LCK on 2022/1/9  10:34
 */
public class SpringTest {
    ApplicationContext ioc;

    @Before
    public void before(){
        ioc = new ClassPathXmlApplicationContext("Spring.xml");
    }

    @Test
    public void test1(){
        UserService bean = ioc.getBean(UserService.class);
        System.out.println(bean.getClass());//class com.lck.service.impl.UserServiceimpl
        //开启aop注解后使用切面功能  class com.sun.proxy.$Proxy21
        User select = bean.select(1);
        System.out.println(select);

    }
}
