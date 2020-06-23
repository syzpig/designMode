package com.syz.designMode.strategy.version2;

import org.springframework.stereotype.Service;

/**
 *@description 借记卡，同样要实现我们抽闲卡去重写具体方法
 *@date 2020/6/23 15:58
 *@author syz
 */
@Service  //因为要托管给spring，所以要加这个配置
public class DebitCard extends Card{
    @Override
    protected String getType() {
        return "debit";
    }

    @Override
    protected void executorTransaction(int money) {
        System.out.println("do executorTransaction with Debit" + money);

    }
}
