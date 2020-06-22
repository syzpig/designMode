package com.syz.designMode.proxy.JDKproxyLanding;

public class ThirdChannelProxy implements Payment {

    //这里面具体要用谁来完成支付呢？我们可以直接new 构建，也可以是客户端传过来
    ThirdChannelPayment payment=new ThirdChannelPayment();
    PaymentLogger paymentLogger=new PaymentLogger();

    @Override
    public String pay(String uid) {
        paymentLogger.log(uid);

        //这个就是通过代理类去执行我们目标方法，但是这个代理之前我么可以做很多的事，
        // 就是上面说的，记录日志，当然也可以在之后做一些事。然后我们就可以通过这个来改变真是类的处理逻辑
        return payment.pay(uid);
    }
}
