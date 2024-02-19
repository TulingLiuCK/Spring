package com.AsyncTest.demo;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
public class AsTest {
    @Test
    public void test7() throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig5.class);
        context.refresh();

        RechargeService rechargeService = context.getBean(RechargeService.class);
        rechargeService.recharge();
        CashOutService cashOutService = context.getBean(CashOutService.class);
        cashOutService.cashOut();

        TimeUnit.SECONDS.sleep(3);
    }
}
