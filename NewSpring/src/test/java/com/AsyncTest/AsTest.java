package com.AsyncTest;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/***
 #Create by LCK on 2022/9/6
 # 用法:
 */
public class AsTest {
    @Test
    public void test1() throws InterruptedException, ExecutionException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig1.class);
        context.refresh();
        GoodsService goodsService = context.getBean(GoodsService.class);

        long startTime = System.currentTimeMillis();
        System.out.println("开始获取商品各种信息");
        long goodsId = 1L;
        Future<String> goodsInfo = goodsService.getGoodsInfo(goodsId);
        Future<String> goodsDesc = goodsService.getGoodsDesc(goodsId);
        Future<List<String>> goodsComments = goodsService.getGoodsComments(goodsId);

        System.out.println(goodsInfo.get());
        System.out.println(goodsDesc.get());
        System.out.println(goodsComments.get());
        System.out.println("获取商品信息完毕，耗时："+(System.currentTimeMillis()-startTime));
        TimeUnit.SECONDS.sleep(3);
    }

}
