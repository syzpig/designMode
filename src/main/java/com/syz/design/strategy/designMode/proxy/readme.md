generalTemplate工程包下面是一个代理模式的通用写法（也是标准的静态代理方法）
但是弊端每次只能代理同一种类型的对对象，或者只能一个类，其他类型的类无法去代理，所以扩展性以及灵活性不够。于是出现动态代理方法。
他针对任何类类型的对象都可以代理（前提是满足jdk 或者cglib动态代理的规则）
