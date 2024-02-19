package com.javaConfig;

import com.alibaba.druid.pool.DruidDataSource;
import com.zhujie.Controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 #Create by LCK on 2022/1/8  21:03
 */
public class javaConfigTest {
    AnnotationConfigApplicationContext ioc;
    @Before
    public void before(){
            ioc=new AnnotationConfigApplicationContext(IocJavaConfig.class);
    }
//    @Test
//    public void test01(){
//        //加载Spring
//        //通过javaConfig来配置
//        UserController bean = ioc.getBean(UserController.class);
//        bean.save();
//    }
    @Test
    public void test2(){
        DruidDataSource bean = ioc.getBean(DruidDataSource.class);
        System.out.println(bean);
    }
}
