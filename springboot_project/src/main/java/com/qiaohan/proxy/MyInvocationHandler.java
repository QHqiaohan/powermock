package com.qiaohan.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    //我们既然要做代理，我们必须知道我们是给谁做代理，这里的obj就是被代理者
    private Object obj;

    public MyInvocationHandler() {
        super();
    }

    public MyInvocationHandler(Object obj) {
        super();
        this.obj = obj;
    }

    /**
     *
     * @param obj
     * @param method
     * @param args
     * @return
     * @throws Throwable
     * invoke的三个参数
     * 第一个参数就是代理者，如果你想对代理者做一些操作可以使用这个参数
     * 第二个就是被执行的方法
     * 第三个是执行该方法所需的参数
     */
    @Override
    public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
        /**
         *  把我们想要通过代理者给被代理者追加的操作都写在invoke方法里面
         */
        System.out.println("前置方法增强");

        Object result=method.invoke(obj,args);

        System.out.println("后置方法增强");

        return result;

    }
}
