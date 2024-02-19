package com.ScheDuTest;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
public class ScheTest {
    @Test
    public void test1() throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig1.class);
        context.refresh();
        TimeUnit.SECONDS.sleep(2);
    }
}
