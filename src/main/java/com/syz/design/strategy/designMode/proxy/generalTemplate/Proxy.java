package com.syz.design.strategy.designMode.proxy.generalTemplate;
/**
 *@description 代理主题对象； 该类是代理模式标准格式的三个角色之一：也被称作：代理类。内部持有真实主题类的引用，因此具备完全的真实主题类的代理权。客户端
 * 调用代理对象的方法，同时也调用被代理对象的方法，但是会在代理对象前后加一些业务处理代码。
 *@date 2020/6/22 10:28
 *@author syz
 */
public class Proxy implements ISubject{
    private ISubject iSubject;
    public  Proxy(ISubject iSubject){
        this.iSubject=iSubject;
    }


    @Override
    public void request() {
        System.out.println("bofer");
        iSubject.request();
        System.out.println("after");
    }
}
