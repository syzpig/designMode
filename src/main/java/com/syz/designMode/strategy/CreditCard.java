package com.syz.designMode.strategy;

/**
 * @author syz
 * @description 信用卡 那么他去继承抽象卡，然后去实现卡类型以及支付
 * @date 2020/6/23 15:55
 */
public class CreditCard extends Card {

    @Override
    protected String getType() {
        return "credit";
    }

    @Override
    protected void executorTransaction(int money) {
        System.out.println("do executorTransaction with Credit" + money);
    }
}
