package com.qiaohan.controller;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Userproxy {

    public  Object getProxy(Object obj){
        Object object= Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                                              obj.getClass().getInterfaces(),
                                              new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if(method.equals("getName")) {
                            System.out.println("前置姓名增强");
                            Object result = method.invoke(obj, args);
                            System.out.println("后置姓名增强");
                            return result;
                        }
                        if(method.equals("getAge")) {
                            System.out.println("前置年龄增强");
                            Object result = method.invoke(obj, args);
                            System.out.println("后置年龄增强");
                            return result;
                        }
                        return null;
                    }
                }
        );

        return object;
    }

}
