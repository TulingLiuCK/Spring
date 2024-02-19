package AOP;

import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2021/12/19  15:56
 */
//被增强类
@Component
public class User {
    public void add(){
        System.out.println("add//////////");

    }
    public void delete(){
        int i = 10 / 0;
        System.out.println("delete1234566");
    }
}
