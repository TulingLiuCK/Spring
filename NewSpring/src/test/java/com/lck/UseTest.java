package com.lck;

import com.lck.bean.User;
import com.lck.dao.UserDao;
import com.lck.service.UserService;
import com.lck.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 #Create by LCK on 2022/1/8  14:42
 */
public class UseTest {
    //测试scope属性
    @Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao = app.getBean("UserDao", UserDao.class);
        User user = app.getBean("user", User.class);
        System.out.println(user);
//        UserDao userDao2 = app.getBean("UserDao", UserDao.class);
        userDao.save();
        System.out.println(userDao);
//        System.out.println(userDao2);
        //先无参构造方法，然后初始化方法，
    }
    @Test
    public void test2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = app.getBean("userService", UserService.class);
        userService.save();
    }
}
