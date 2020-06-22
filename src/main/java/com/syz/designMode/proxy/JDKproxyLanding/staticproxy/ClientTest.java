package com.syz.designMode.proxy.JDKproxyLanding.staticproxy;

import com.syz.designMode.proxy.JDKproxyLanding.jdkproxy.PayDynamicProxy;

public class ClientTest {
    public static void main(String[] args) {
       /* Payment payment =new ThirdChannelPayment();
        payment.pay("122");*/
        //上面这种非代理模式的调用 是直接用端直接跟我们的真实主题是直接关联；
        //那么此时如果我们要给我们的支付额加一些处理该怎么办呢？
        //我们想给ThirdChannelPayment添加支付日志记录。怎么办呢？我是是不是就要就要对他进行修改。
        //但是如果我们的支付通道有很多，比如，银行，银联，微信等等。那是不是意味着，我们要在每一个支付类中去这个添加日志的代码，
        //这个一方便比较麻烦，二是不符合我们代码的设计
        //所以我们可以加一个代理类ThirdChannelProxy   ,但是这个代理类必须实现我们的Payment。因为他代理的是我们的支付，看代理类


        //使用动态代理改造后，我们调用就会不这么调用了

        Payment payment=new ThirdChannelPayment();
        PayDynamicProxy payDynamicProxy=new PayDynamicProxy();
        Payment p1=(Payment) payDynamicProxy.bind(payment);//他会返回一个代理对象
        System.out.println(p1.pay("123"));
        //我们呢可以发现只要我们有这个代理对象，他可以帮我们代理任何的类

    }
}
