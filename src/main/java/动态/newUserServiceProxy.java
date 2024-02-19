package 动态;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/9/15
 # 用法:
 */
@Component
@Aspect
@Order(1)
public class newUserServiceProxy {
    @Before(value = "execution(* UserServiceImpl.add())")
    public void before(){
        System.out.println("before.........");
    }
}
