package com.qiaohan.controller;

import com.qiaohan.interfaces.UserService;
import com.qiaohan.service.UserServiceImpl;

public class ProxyTest {

    public static void main(String[] args) {
        Userproxy userproxy=new Userproxy();
        UserService userService=new UserServiceImpl();
        userService= (UserService) userproxy.getProxy(userService);
        userService.getName("乔瀚");

    }



}
