package com.syz.designMode.proxy.JDKproxy;

public class ClientTest {
    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson iPerson = jdkMeipo.getInstance(new People());
        iPerson.findLove();
    }
}
