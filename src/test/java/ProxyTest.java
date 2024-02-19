import org.junit.Test;
import 动态.proxy.UserDao;
import 动态.proxy.UserDaoImpl;
import 动态.rent.模板.ProxyInvocationHandler;

/***
 #Create by LCK on 2021/12/19  15:02
 */
public class ProxyTest {
    @Test
    public void test(){
        //真是角色
        UserDaoImpl userDaoimpl = new UserDaoImpl();
        //代理角色 不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序来处理我们要调用的接口对象
        pih.setTarget(userDaoimpl);
        UserDao proxy = (UserDao) pih.getProxy();
        proxy.add();
    }
}
