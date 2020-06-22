package com.syz.designMode.proxy.JDKproxyLanding.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *@description 我们要实现jdk动态代理就需要实现InvocationHandler这个接口
 *@date 2020/6/22 17:38
 *@author syz
 */
public class PayDynamicProxy implements InvocationHandler {
    //1首先这里我们要去定义我们被代理的对象
    private Object target;

    //2然后我们可以去绑定一个委托对象
    public Object bind(Object target){
        //把传入的被代理对象赋值
        this.target=target;
        //然后去返回一个被代理的对象    this这个this就是表示实现了这个InvocationHandler的代理类对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }

    //再然后我们就可以在这个incoke去做我们想做的额外操作
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("记录日志开始");
        Object obj=method.invoke(target,args);//这个是通过method反射去调用对应的目标对象target的方法，以及他的参数是什么
        System.out.println("记录日志结束");

        return obj;
    }
}
