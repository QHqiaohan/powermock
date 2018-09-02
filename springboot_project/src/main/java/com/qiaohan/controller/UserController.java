package com.qiaohan.controller;

import com.qiaohan.interfaces.UserService;
import com.qiaohan.proxy.MyInvocationHandler;
import com.qiaohan.service.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class UserController {

    public static void main(String[] args) {

        UserService userService=new UserServiceImpl();

        InvocationHandler invocationHandler=new MyInvocationHandler(userService);

        UserService userServiceProxy=(UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                               userService.getClass().getInterfaces(),
                               invocationHandler
                );


        userServiceProxy.getName("乔瀚");

        userServiceProxy.getAge(24);


    }

}
