package com.factoryBeanT;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

/***
 #Create by LCK on 2022/10/24
 # 用法:
 */
@Data
public class ConnectionFactoryBean implements FactoryBean<Connection> {
    /**
     *  mysql 高版本链接时，需要指定SSL证书，解决问题的方式
     *  url = "jdbc:mysql://localhost:3306/book?useSSL=false"
     */
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    //用于书写创建复杂对象的代码
    @Override
    public Connection getObject() throws Exception {
        Class.forName(driverClassName);
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }

    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    /**
     * 返回true只会创建一个复杂对象
     * 返回false每一次都会创建新的对象
     */
    //连接对象能被大家共用
    @Override
    public boolean isSingleton() {
        return false;
    }
}
