# 软件设计原则
##一、单一原则 
  一个类只做一件事，
好处：
类的职责单一了，一目了然
可读性和和复杂度也降低了
可维护性提高了
变更引起的风险降低了
坏处：
增加了类和接口，导致后期的维护会比较复杂。
针对类维护层面
##二、里氏替换原则
    子类可以扩展父类的功能但是不能改变父类原有的功能。
也就是说只要父类出现的地方，子类也一定可以出现，而且替换成子类不会出现异常或者错误。如果子类不能完整的去实现父类的方法，或者父类的某些方法在子类已经发生改变的话，那么建议他们父子关系就要完全隔开。可以通过依赖组合，聚合来替换集成关系。
##三、依赖倒置原则 
    通过抽象使各个类实现彼此的独立，不相互影响，实现模块之间的松耦合。
那么面向接口编程实际上就是抓住了依赖倒置的核心。
##四、接口隔离原则
    讲的就是尽量保持接口的纯洁性，单一性；他跟单一职责很像，但是他们强调的是两个方面，单一职责强调的专一的业务划分，而接口隔离强调的时接口则是细化，最好是提供最小的方法。
##五、开闭原则
    对扩展开放，对修改关闭
##六、迪米特法则
    就是一个类对自己依赖的类知道越少越好，也就是对于被依赖的类来说，无论他逻辑如何复杂，都要将逻辑封装在类的内部，对外提供一个public方法，。
我们的门面模式就是最典型的迪米特法则的应用。

注：e21fef84e30f0c69bd3beb62d13f9bff70cce69b  是适配器业务场景落地 非策略模式