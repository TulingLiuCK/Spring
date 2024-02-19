package zhujie.dao.impl;

import org.springframework.stereotype.Repository;
import zhujie.dao.UserDao;

/***
 #Create by LCK on 2021/12/18  23:15
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add.......");
    }
}
