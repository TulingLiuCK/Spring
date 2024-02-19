import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/***
 #Create by LCK on 2021/12/18  22:23
 */
public class MySqlTest {
    @Test
    public void test() throws SQLException {
        //加载解析配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("druid.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        //3获取连接
        Connection connection = dataSource.getConnection(); 
        System.out.println(connection);


    }
}
