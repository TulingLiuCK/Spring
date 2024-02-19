package com.EnableAspectJAutoProxyTest;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;



/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
    private static Logger logger = LoggerFactory.getLogger(MyMethodBeforeAdvice.class);
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        logger.info("我是MethodBeforeAdvcie");
    }
}

