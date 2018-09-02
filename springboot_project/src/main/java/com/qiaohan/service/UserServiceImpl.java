package com.qiaohan.service;

import com.qiaohan.interfaces.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public String getName(String name) {
        System.out.println("---------getName()----------");
        return "乔瀚";
    }

    @Override
    public int getAge(int age) {
        System.out.println("------------getAge()-----------");
        return 24;
    }
}
