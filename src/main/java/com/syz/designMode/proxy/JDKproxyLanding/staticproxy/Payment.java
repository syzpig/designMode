package com.syz.designMode.proxy.JDKproxyLanding.staticproxy;
/**
 *@description 抽象类型  我们模拟支付业务 ，他有不同的支付方式
 *@date 2020/6/22 16:57
 *@author syz
 */
public interface Payment {
    String pay(String uid);
}
