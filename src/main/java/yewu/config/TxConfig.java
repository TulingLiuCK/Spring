package yewu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/***
 #Create by LCK on 2021/12/20  16:33
 */
//@Configuration//配置类
//@ComponentScan(basePackages = "yewu") //组件扫描
//@EnableTransactionManagement//开启事务
//public class TxConfig {
//    //创建数据库连接池
//    @Bean
//    public DruidDataSource getDruidDataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/book?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//        return dataSource;
//    }
//
//    //创建JdbcTemplate对象
//    @Bean
//    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
//        //到ioc容器中根据类型找到dataSource
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        //注入datasource
//        jdbcTemplate.setDataSource(dataSource);
//        return jdbcTemplate;
//    }
//
//    //创建事务管理器对象
//    @Bean
//    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
//        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
//        dataSourceTransactionManager.setDataSource(dataSource);
//        return dataSourceTransactionManager;
//
//    }
//}
