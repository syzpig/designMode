package com.syz.designMode.strategy.busic;
/**
 *@description 假如这是我们的商品
 *@date 2020/6/23 16:02
 *@author syz
 */
public class Item {
    private String name;
    private int money;

    public Item(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
