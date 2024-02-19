import FactoryBean.MyBean;
import com.lck.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 #Create by LCK on 2021/12/18  20:58
 */
public class FactoryTest {
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Factory.xml");
        User myBean = context.getBean("myBean", User.class);

        System.out.println(myBean);
    }
}
