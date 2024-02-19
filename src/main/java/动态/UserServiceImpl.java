package 动态;

import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2021/12/19  13:47
 */
@Component
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加功能");
    }

    @Override
    public void delete() {
        System.out.println("删除功能");
    }

    @Override
    public void update() {
        System.out.println("修改功能");
    }

    @Override
    public void query() {
        System.out.println("查询功能");
    }
}
