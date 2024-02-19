package zhujie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import zhujie.dao.UserDao;

/***
 #Create by LCK on 2021/12/18  23:03
 */
@Service
public class UserService {
    //不需要添加set方法
    @Autowired //根据类型进行注入
    private UserDao userDao;

    public void add(){
        System.out.println("service add....");
        userDao.add();
    }
}
