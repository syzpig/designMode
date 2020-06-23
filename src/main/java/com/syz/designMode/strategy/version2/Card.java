package com.syz.designMode.strategy.version2;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author syz
 * @description 2:我们基于PaymentMethod这个接口去扩展,于是我们可以先定义一个card的抽象类你，那么这Card的抽象类里面他可以去定义Card的抽象数据属性
 * 那么为什么要定义为抽象类呢？
 * 在java里面他是一个面向对象的编程语言。我们去编写代码的时候，我们更希望去以一种抽象化的或者说面向具体对象的的一种语言去实现。
 * 比如说我们支付方式定义好了。我么ka又有有卡支付和无卡支付，无卡支付就比如积分，卡券，支付宝等等都是无卡支付；那么对于卡支付，我们需要有一些卡的特性。比如卡的卡号，
 * 卡的姓名，卡的过期时间等等一些属性。那比如还有储蓄卡和信用卡，那么不同卡的操作方式还不一样。所以我们顶定义一个抽象的去对卡的公共的模型去做一个抽象。
 * @date 2020/6/23 15:30
 */
public abstract class Card implements PaymentMethod {

    //因为我们知道spring他是一个bean的管理容器，
    public static Map<String, PaymentMethod> paymentMethodMap = new ConcurrentHashMap<>();

    //所以我们可以在里初始化bean的时候,把我们的对象初始化到我们集合当中
    @PostConstruct
    //Java中该注解的说明：@PostConstruct该注解被用来修饰一个非静态的void（）方法。当bean创建完成的时候，会后置执行@PostConstruct修饰的方法。
    //通常我们会是在Spring框架中使用到@PostConstruct注解 该注解的方法在整个Bean初始化中的执行顺序：
    //Constructor(构造方法) -> @Autowired(依赖注入) -> @PostConstruct(注释的方法)
    //   javaEE5引入了@PostConstruct和@PreDestroy两个作用于Servlet生命周期的注解，实现Bean初始化之前和销毁之前的自定义操作, PostConstruct 注释用于在依赖关系注入完成之后需要执行的方法上，以执行任何初始化。此方法必须在将类放入服务之前调用
    public void init() {//这个方法写在每一个子类中也可以，就是类加载完之后，执行这个方法 https://blog.csdn.net/wo541075754/article/details/52174900
        paymentMethodMap.put(getType(), this);//在我们初始化子类的时候，他会得到之类的type同时他的value就是我们子类

    }

    //所以这里支付我们就可以去打印一下，以及支付方式。那么支付方式我们就可以采用模板方法去实现。
    @Override
    public void pay(int money) {
        System.out.println("use" + getType() + "->payId:" + money + "￥");//就是使用某一种卡类型去支付
        //支付完之后呢？他要去调用一下executorTransaction方法。去具体执行支付操作。
        executorTransaction(money);//而这个具体执行，因为他本身是一个抽象类，所以中Card卡他不具备支付功能，因为他不确定他是那一种卡，他是抽象的；所以
        //我们定义他的模板方式，需要通过子类去实现。比如我们有信用卡CreditCard，贷记卡等等
        //那么这个就是我们一种扩展，也就是我们的一种策略。
    }

    //这是一个抽象模板方法，这种也是在源码中经常用到的方式；就是在抽象模型中去定义一些公关的模板方法，然后通过具体的子类去实现
    protected abstract String getType(); //卡类型

    protected abstract void executorTransaction(int money);
}
