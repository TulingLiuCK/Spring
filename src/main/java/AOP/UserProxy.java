package AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2021/12/19  15:56
 */
//增强类
@Component
@Aspect //生成代理对象
@Order(1)
public class UserProxy {
    @Before(value = "execution(* AOP.User.delete())")
    public void before(){
        System.out.println("before.........");
    }
    @After(value = "execution(* AOP.User.delete())")
    public void after(){
        System.out.println("after..........");
    }
    @AfterReturning(value = "execution(* AOP.User.delete())")
    public void afterReturning(){
        System.out.println("afterReturning./////");
    }
    @AfterThrowing(value = "execution(* AOP.User.delete())")
    public void afterThrowing(){
        System.out.println("afterThrowing/.....");
    }
    @Around(value = "execution(* AOP.User.delete())")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        proceedingJoinPoint.proceed();//让方法执行。
        System.out.println("环绕之后");

    }
}
