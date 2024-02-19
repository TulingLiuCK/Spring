import Automati.entity.Dog;
import Automati.entity.People;
import com.lck.dao.impl.UserMyImpl;
import com.lck.entity.Student;
import com.lck.service.UserService;
import com.lck.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 #Create by LCK on 2021/12/18  13:55
 */
public class MyTest {
    //    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//         UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
//         userServiceImpl.getUser();
//    }
    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Auromati.xml");
        People people = context.getBean("people", People.class);
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(people);
//        dog.show();
//        System.out.println(dog);
        people.getDog().show();
        people.getCat().show();
    }
}
