package com.syz.designMode.proxy.generalTemplate;
/**
 *@description 真实主题角色类；该类是代理模式标准格式的三个角色之一：也被称之为被代理类。该类表示的是真实的代理对象，主要负责执行系统真正的逻辑业务对象
 *@date 2020/6/22 10:25
 *@author syz
 */
public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("real object is run!");
    }
}
