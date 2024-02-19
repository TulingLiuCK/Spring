package 动态.rent;

/***
 #Create by LCK on 2021/12/19  14:06
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理juese
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要用的接口
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
