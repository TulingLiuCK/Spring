import Life.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 #Create by LCK on 2021/12/18  21:21
 */
public class LifeTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Life.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步，获取创建bean实例对象");
        System.out.println(orders);
        //手动让bean实例销毁
        ((ClassPathXmlApplicationContext)context).close();
    }
}
