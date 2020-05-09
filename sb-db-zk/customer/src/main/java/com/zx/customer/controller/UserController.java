package com.zx.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zx.common.domin.User;
import com.zx.common.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("getUser")
    public User user(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        return userService.findUser();
    }
}