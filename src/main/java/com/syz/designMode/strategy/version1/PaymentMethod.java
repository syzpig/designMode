package com.syz.designMode.strategy.version1;
/**
 *@description 1.首先我们需要先去定义一个接口，里面是支付方法的接口;然后我们就可以基于这个接口去扩展
 *@date 2020/6/23 15:28
 *@author syz
 */
public interface PaymentMethod {
    void pay(int money);
}
