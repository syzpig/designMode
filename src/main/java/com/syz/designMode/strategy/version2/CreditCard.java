package com.syz.designMode.strategy.version2;

import org.springframework.stereotype.Service;

/**
 * @author syz
 * @description 信用卡 那么他去继承抽象卡，然后去实现卡类型以及支付
 * @date 2020/6/23 15:55
 */
@Service  //因为要托管给spring，所以要加这个配置
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
