package com.syz.designMode.lambda.demo2;

public class Demo04 {
    public static void main(String[] args) {
        show(() -> System.out.println("lambda执行了。。。。"));
    }
    public static void show(MyFunctionalInterface mi) {
        mi.method();// 调用自定义的函数式接口方法
    }
}
