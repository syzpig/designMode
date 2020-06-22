package com.syz.designMode.proxy.JDKproxyLanding.staticproxy;

/**
 * @author syz
 * @description 真实支付主题
 * @date 2020/6/22 16:58
 */
public class ThirdChannelPayment implements Payment {

    @Override
    public String pay(String uid) {
        System.out.println("uid" + uid + "发起了支付操作");
        return "success";
    }
}
