这里就是我们静态代理的应用
那么代理类他有好的地方也有不好的地方
不好地方：
1.一个代理类他只能代理一类对象，我们看代码，他只能实现payment这一个接口，也就是我们只能代理这一类对象
2.如果我们要去代理多类型的对象，我么就要去实现多个ThirdChannelProxy这样的一个代理类。也就是造成这个类膨胀，难以维护。
所以这是静态代理的两个缺点
那么如何去解决呢？
首先java提供了动态代理的方式。
看demo