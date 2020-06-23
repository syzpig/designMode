package com.syz.designMode.strategy.busic;

import com.syz.designMode.strategy.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syz
 * @description 这是我们的账单
 * @date 2020/6/23 16:03
 */
public class Bill {
    //他会有我们多个商品 也就是商品列表
    private List<Item> itemList = new ArrayList<>();

    //然后有一个添加的方法，也就是加入购物车
    public void addItem(Item item) {
        itemList.add(item);
    }

    //移除购物车
    public void removeItem(Item item) {
        itemList.remove(item);
    }

    //计算商品总和的价格
    public int getSumMoney() {
        return itemList.stream().mapToInt(item -> item.getMoney()).sum();
    }

    //然后就是定义支付方法，吧购物车中总金额传进去
    public void pay(PaymentMethod paymentMethod) {
        paymentMethod.pay(getSumMoney());
    }
}
