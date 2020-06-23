package com.syz.designMode.strategy.version1.factory;

import com.syz.designMode.strategy.version1.CreditCard;
import com.syz.designMode.strategy.version1.DebitCard;
import com.syz.designMode.strategy.version1.PaymentMethod;

/**
 * @author syz
 * @description 这里我们去构建我么支付的类型，也就是构建我们的支付通道
 * @date 2020/6/23 16:19
 */
public class PaymentMethodFactory {

    public static PaymentMethod getPaymentMethod(String type) {
        switch (type) {
            case "credit":
                return new CreditCard();
            case "debit":
                return new DebitCard();
            default:
                return (PaymentMethod) new RuntimeException("can`t  find type");
        }
    }
    //这是我们工厂的一个模式
}
