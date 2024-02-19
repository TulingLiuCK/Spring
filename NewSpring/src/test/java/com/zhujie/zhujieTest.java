package com.zhujie;

import com.lck.service.impl.UserServiceImpl;
import com.zhujie.Controller.UserController;
import com.zhujie.service.UserService;
import com.zhujie.service.impl.UserServiceimpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 #Create by LCK on 2022/1/8  16:32
 */
public class zhujieTest {
    @Test
    public void test() {
        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext-zhujie.xml");
        UserController bean = app.getBean(UserController.class);
        bean.save();
    }

}
