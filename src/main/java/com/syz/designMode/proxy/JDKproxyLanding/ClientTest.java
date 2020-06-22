package com.syz.designMode.proxy.JDKproxyLanding;

public class ClientTest {
    public static void main(String[] args) {
        Payment payment =new ThirdChannelPayment();
        payment.pay("122");
    }
}
