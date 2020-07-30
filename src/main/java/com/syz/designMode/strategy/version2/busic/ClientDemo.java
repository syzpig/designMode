package com.syz.designMode.strategy.version2.busic;


import com.syz.designMode.strategy.version2.Card;
import com.syz.designMode.strategy.version2.spring.Configure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        Bill bill=new Bill();//首先初始化购物车
        //然后添加商品
        bill.addItem(new Item("netty核心原理",120));
        bill.addItem(new Item("springboot核心思想",99));
        bill.addItem(new Item("高并发实战原理",110));


       //那么我们调用的时候 首先我们支付方式的生成就不需要我们手动去改变工厂模式的代码去生成。不需要手动扩展，直接在卡的实现类上加个@service注解就可以了
        // 首先我们要先加载我们spring配置文件，然后去启动我们spring
        //ApplicationContext context=new FileSystemXmlApplicationContext("classpath:applicationContext.xml"); 没有使用注解驱动的时候我们是去加载配置文件，现在我们采用注解驱动，可以使用如下方式
        ApplicationContext applicationContext=new
                AnnotationConfigApplicationContext(Configure.class);
        ((AnnotationConfigApplicationContext) applicationContext).start();
        //最后运行支付代码的时候我们就不需要使用工厂了
        bill.pay(Card.paymentMethodMap.get("credit"));
        //我们会发现这根刚刚的工厂模式有什么，区别的呢？
        //区别就是：我们第一了一个静态的map成员变量。然后我们构建启动的时候，他就可以把我们对象放入map中去管理。所以这个就可以解耦，而且不需要去改变我们工厂的定义了。
    }
}
