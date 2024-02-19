import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

import yewu.service.UserService;



/***
 #Create by LCK on 2021/12/20  10:04
 */
public class yewuTest {
    @Test
    public void test(){

        ApplicationContext context = new ClassPathXmlApplicationContext("yewu.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.zhuanzhang();
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("shiwu.xml");//加载配置类
        UserService userService = context.getBean("userService", UserService.class);
        userService.zhuanzhang();
    }
}
