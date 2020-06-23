package com.syz.designMode.strategy.version1;

/**
 *@description 借记卡，同样要实现我们抽闲卡去重写具体方法
 *@date 2020/6/23 15:58
 *@author syz
 */
public class DebitCard extends Card {
    @Override
    protected String getType() {
        return "debit";
    }

    @Override
    protected void executorTransaction(int money) {
        System.out.println("do executorTransaction with Debit" + money);

    }
}
