package com.syz.designMode.proxy.Cglibproxy;
/**
 *@description ${description}
 *@date 2020/6/22 14:02
 *@author syz
 */
public class ClientTest {
    public static void main(String[] args) {
        CglibMeipo cglibMeipo=new CglibMeipo();
        Customer customer= (Customer) cglibMeipo.getInstance(Customer.class);
        customer.findLove();
    }
}
