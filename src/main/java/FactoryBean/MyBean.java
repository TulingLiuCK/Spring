package FactoryBean;

import com.lck.entity.User;
import org.springframework.beans.factory.FactoryBean;

;

/***
 #Create by LCK on 2021/12/18  20:56
 */
public class MyBean implements FactoryBean<User> {
    /*
    *@Description
    *@Param []
    *@return java.lang.Object
    */
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("abc");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
