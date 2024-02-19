package com.BeanFactoryTest;

import com.factoryBeanT.ConnectionFactoryBean;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
public class BeanDefinitionRegistryPostProcessorTest {
    private Logger logger = LoggerFactory.getLogger(BeanDefinitionRegistryPostProcessorTest.class);
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig0.class);
        context.refresh();
        System.out.println(context.getBean("userName"));
        System.out.println(context.getBean("car"));
    }
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig0.class);
        context.refresh();
        context.getBeansOfType(String.class).forEach((beanName,bean) ->{
            System.out.println(String.format("%s -> %s", beanName,bean));
        });
    }
    //用于测试FactoryBean接口
    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Connection conn = (Connection) context.getBean("conn");
        System.out.println("conn ="+conn);
    }

    /**
     *
     */
    @Test
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ConnectionFactoryBean conn = (ConnectionFactoryBean) context.getBean("&conn");
        System.out.println("conn ="+conn);
    }
    @Test
    public void test5(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Connection conn1 = (Connection) ctx.getBean("conn");
        Connection conn2 = (Connection) ctx.getBean("conn");
        logger.info("conn1="+conn1);
        logger.info("conn2="+conn2);
        System.out.println("conn1="+conn1);
        System.out.println("conn2="+conn2);
    }

}
