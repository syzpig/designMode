package com.syz.designMode.proxy.CglibproxyLanding;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author syz
 * @description 这里我们要首先实现cglib动态代理的接口
 * @date 2020/6/22 17:38
 */
public class CgLibPayDynamicProxy implements MethodInterceptor {
    //1首先同样我们要去定义一个Object target对象。这是我们需要去代理的业务类的对象,他可以是接口，也可以是类
    private Object target;

    //2同样我们也要去获取代理的实例
    public Object getInstance(Object target) {
        //然后去构建这个实例
        this.target = target;
        //再然后就是通过一个加强器，去创建动态代理类的
        Enhancer enhancer = new Enhancer();//加强器
        enhancer.setSuperclass(this.target.getClass());//给加强器指定业务代理类，为下面生成的代理类指定父类。
        enhancer.setCallback(this);//这是他的回调，就是调用下面intercept（）的方法
        return enhancer.create();//最后通过他去创建
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("记录日志开始");
        Object obj=methodProxy.invoke(o,objects);//这个是是调用业务类的方法。他实际上就是调用父类的方法了。因为创建的代理类实际上就是这个父类的子类。
        System.out.println("记录日志结束");
        return obj;
    }
}
