import AOP.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import 动态.UserService;
import 动态.UserServiceImpl;

/***
 #Create by LCK on 2021/12/19  16:08
 */
public class AopTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("AOP.xml");
        User user = context.getBean("user", User.class);
        user.delete();
    }
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("AOP.xml");
        context.getBean("userServiceHH");

    }
}
