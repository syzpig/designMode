package com.syz.designMode.strategy.version1.busic;

import com.syz.designMode.strategy.version1.factory.PaymentMethodFactory;

public class ClientDemo {
    public static void main(String[] args) {
        Bill bill=new Bill();//首先初始化购物车
        //然后添加商品
        bill.addItem(new Item("netty核心原理",120));
        bill.addItem(new Item("springboot核心思想",99));
        bill.addItem(new Item("高并发实战原理",110));
        //然后去支付;但是这里面临一个问题，就是我们要去选择使用什么支付方式？
        //那么我们实际上用户会去勾选，支付的渠道。所以这里我们可以去定义一个工厂去支付。
        //我们定义好工厂的模式之后，这里我们直接去调对应的支付类型
        bill.pay(PaymentMethodFactory.getPaymentMethod("credit"));
        //这就是我们策略模式加工厂模式的一个应用
    }
}
