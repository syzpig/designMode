package com.syz.designMode.proxy.JDKproxyLanding;
/**
 *@description 支付日志类  这个是想给我们的支付加一个支付日志
 *@date 2020/6/22 17:14
 *@author syz
 */
public class PaymentLogger {
    public void log(String uid){
        System.out.println("uid="+uid+"发起了日志支付行为 日志记录");
    }
}
