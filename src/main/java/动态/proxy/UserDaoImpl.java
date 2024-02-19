package 动态.proxy;

/***
 #Create by LCK on 2021/12/19  15:01
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("执行添加操作");
    }
}
