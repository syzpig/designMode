package com.syz.design.strategy.designMode.proxy.generalTemplate;

/**
 * @author syz
 * @description 客户端
 * @date 2020/6/22 10:36
 */
public class ClientTest {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}
