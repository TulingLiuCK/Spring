package com.javaConfig.Controller;


import com.javaConfig.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/***
 #Create by LCK on 2022/1/8  17:37
 */
@Controller
public class UserController {

    /**
     * @return: 使用@Autowired来实现自动注入
     * 默认优先根据类型匹配
     * 如果匹配到多个类型，根据名字去匹配
     * 如果名字没有匹配到会报错
     * 1可以去修改属性的名字 UserService userServcieImpl
     * 2可以修改Bean的名字：@Service("userService")
     * 3还可以使用Qualifier（”userServiceImpl“）
     */
    @Autowired
    @Qualifier("userServiceimpl")
    UserService userService;

    public void save() {
        userService.save();
    }
}
