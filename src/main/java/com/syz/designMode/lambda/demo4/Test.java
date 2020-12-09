package com.syz.designMode.lambda.demo4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out ::println;
        consumer.accept("1111");


        ArrayList<String> arrayList = new ArrayList<>();
        Consumer<ArrayList> consumer1 = (e)-> e.add("111");
    }
}
