package com.syz.designMode.lambda.demo1;

public class Test01 {
    public static void main(String[] args) {
        String strA = "Hello ";
        String strB = "World ";
        String strC = "Java";
        method(1,() -> strA+strB+strC);
    }
    private static void method(int level, MessageBuilder builder) {
        //判断
        if (level == 1) {
            //只有level等于1的时候才会执行这句话，才会执行lambda，然后才能进行拼接
            System.out.println(builder.buildMessage());
        }
    }
}
