package com.LazyLoaderTest;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.LazyLoader;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
public class LazyTest1 {
    public static class UserModel{
        private String name;

        public UserModel() {
        }

        public UserModel(String name) {
            this.name = name;
        }
        public void say(){
            System.out.println("你好"+name);
        }
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserModel.class);
        //创建一个LazyLoader对象
        LazyLoader lazyLoader = new LazyLoader(){

            @Override
            public Object loadObject() throws Exception {
                System.out.println("调用LazyLoader.loadObject()方法");
                return new UserModel("java");
            }
        };
        enhancer.setCallback(lazyLoader);
        Object proxy = enhancer.create();
        UserModel userModel = (UserModel) proxy;
        System.out.println("第一次调用say方法");
        userModel.say();
        System.out.println("第一次调用say方法");
        userModel.say();
    }
}
