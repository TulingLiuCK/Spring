package 动态;

/***
 #Create by LCK on 2021/12/19  13:47
 */
public class Test {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.add();
        System.out.println("-----------");
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();

    }
}
