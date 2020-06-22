package com.syz.design.strategy.designMode.proxy.JDKproxy;
/**
 *@description 真实主题，被代理对象
 *@date 2020/6/22 10:55
 *@author syz
 */
public class People implements IPerson{
    @Override
    public void findLove() {
        System.out.println("-------------to相亲----------");
    }
}
