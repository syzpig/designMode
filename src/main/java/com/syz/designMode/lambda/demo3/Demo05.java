package com.syz.designMode.lambda.demo3;

public class Demo05 {
    public static void main(String[] args) {
        getSum(150,250,(a,b) -> a + b);

    }

    public void sub(){
        sub(150,250,(a,b) -> a - b);
    }

    private static void getSum(int a,int b,Sumable sumable){
        int sum = sumable.sum(a, b);
        System.out.println(sum);
    }
    private  void sub(int a,int b,Sumable sumable){
        int sum = sumable.sum(a, b);
        System.out.println(sum);
    }
}
