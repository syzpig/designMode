package com.syz.designMode.proxy.generalTemplate;
/**
 *@description 抽象主题类  该类是代理模式标准格式的三个角色之一：抽象主题角色 该类职责就是声明真实主题与代理的共同方法，该抽象主题类可以使接口或者抽象类（jdk与cglib动态代理）
 *@date 2020/6/22 10:20
 *@author syz
 */
public interface ISubject {
    void request();
}
