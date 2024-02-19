package com.newAop;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
public class UserService {
    public void work(String userName){
//        int i = 10/0;
        System.out.println(userName+",正在加班");
    }
}
