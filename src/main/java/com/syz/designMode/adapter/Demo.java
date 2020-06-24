package com.syz.designMode.adapter;

public class Demo {

    public static void main(String[] args) {
        CloudController cloudController=new CloudController(new CloudService("aliSDK"));
        cloudController.storeFiletoCloud();
    }

    //这就是我们设计模式用的一些方法
}
