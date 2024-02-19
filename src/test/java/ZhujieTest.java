import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhujie.entity.User;
import zhujie.service.UserService;

/***
 #Create by LCK on 2021/12/18  20:33
 */
public class ZhujieTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("zhujie.xml");
        UserService userSerivce = context.getBean("userSerivce", UserService.class);
        System.out.println(userSerivce);
        userSerivce.add();

    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("zhujie.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
