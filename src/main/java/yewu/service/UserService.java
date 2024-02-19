package yewu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yewu.dao.UserDao;

/***
 #Create by LCK on 2021/12/20  10:05
 */

@Service

public class UserService {
    //注入Dao
    @Autowired
    private UserDao userDao;
    @Transactional  //开启事务注解也可在类上添加，也可以在方法上添加
    public void zhuanzhang(){
//        try {
            //第一步开启事务

            //第二部进行业务操作
            userDao.reduceMoney();
            //模拟异常
            int i  = 10/0;
            userDao.addMoney();
            System.out.println("操作成功");

            //第三步 没有发生异常，事务提交
//        }catch (Exception e){
//            //第四步，出现异常，事务回滚
//        }




    }
}
