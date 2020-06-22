package com.syz.designMode.proxy.JDKproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author syz
 * @description 创建一个婚介所 代理类 这里使用jdk动态代理的方式
 * @date 2020/6/22 10:52
 */
public class JdkMeipo implements InvocationHandler {
    private IPerson target;

    public IPerson getInstance(IPerson iPerson) {
        this.target = iPerson;
        Class<?> clazz = target.getClass();
        //1:param  类加载器定义代理类
        //2:param  代理类的接口列表
        //3:param  调用处理程序，用于将方法调用分派给具有指定类加载器定义并实现指定接口的代理类的指定调用处理程序的代理实例
        return (IPerson)Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    //1:param  调用基础方法的对象
    //2:param  返回调度结果表示的方法
    //3:param  用于方法调用的参数
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---------before----");
        Object object=method.invoke(this.target,args);
        System.out.println("---------after----");
        return object;
    }
}
