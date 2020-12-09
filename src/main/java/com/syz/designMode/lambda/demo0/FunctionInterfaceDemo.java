package com.syz.designMode.lambda.demo0;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
/*
 * 函数式接口其实本质上还是一个接口，但是它是一种特殊的接口：SAM类型的接口（Single Abstract Method）。定义了这种类型的接口，使
 * 得以其为参数的方法，可以在调用时，使用一个lambda表达式作为参数。从另一个方面说，一旦我们调用某方法，可以传入lambda表达式作为
 * 参数，则这个方法的参数类型，必定是一个函数式的接口，这个类型必定会使用@FunctionalInterface进行修饰。
 * 从SAM原则上讲，这个接口中，只能有一个函数需要被实现，但是也可以有如下例外:
 * 1. 默认方法与静态方法并不影响函数式接口的契约，可以任意使用，即函数式接口中可以有静态方法，一个或者多个静态方法不会影响SAM接
 * 口成为函数式接口，并且静态方法可以提供方法实现
 * 可以由 default 修饰的默认方法方法，这个关键字是Java8中新增的，为的目的就是使得某一些接口，原则上只有一个方法被实现，但是由于
 * 历史原因，不得不加一些方法来兼容整个JDK中的API，所以就需要使用default关键字来定义这样的方法
 * 2. 可以有 Object 中覆盖的方法，也就是 equals，toString，hashcode等方法。
 *
 * 存在意义：
 * java是面向对象的，但是为了写起来方便，需要向一个方法传递一个方法，但是实际上并不能传递方法，而是传递了只有一个抽象方法的接口的实现类的对象，这样就做到类似传递方法了，其实lanmada就是一个对象
 *
 * 我们需要注意的是仅仅当参数是函数接口的时候才可以使用lambda表达式代替
 * */

public class FunctionInterfaceDemo {

    public static void main(String[] args) {
//        testPredicate();
        testFunction();
//        testSupplier();
//        testPredicate();
    }


    /**
     * 演示Predicate<T>的使用
     * <p>
     * Predicate<T>：断言型接口
     * 方法：boolean test(T t)，需要传入参数T，返回boolean，因为只有一个抽象方法，所以可以使用lambda表达式实现
     * Predicate可以利用and、or和negate组成与、或和非等复杂的逻辑。
     */
    public static void testPredicate() {
    /*    Predicate<String> predicateOne = (s) -> StringUtils.isNotEmpty(s);
        Predicate<String> predicateTwo = (s) ->  s.length() > 10;
        System.out.println(predicateOne.and(predicateTwo).test("hello"));
*/
        Predicate<String> m=s-> s!=null;
        m.test("");
        short s1 = 1; s1 += 1;
      /*  Predicate<Integer> maxReceivers=r->r.equals(1);
        System.out.println(  maxReceivers.test(1));*/
        Integer num = 17;
        System.out.println((int) Math.floor(Double.valueOf(num / 7) + 1));
    }


    /**
     * 演示Function<T>的使用
     * Function<T>:函数型接口
     * 方法：R apply(T t)，需要传入参数T，返回R,因为只有一个抽象方法，所以可以使用lambda表达式实现
     * Function可以利用compose和andThen来对参数进行组合处理
     */
    public static void testFunction() {
        Function<String, String> function = (s) -> s.toUpperCase();
        System.out.println(function.apply("hello world"));
    }

    /**
     * 演示Supplier<T>的使用
     * Supplier<T>：供给型接口
     * 方法：T get()，直接返回一个结果
     */
    public static void testSupplier() {
        Supplier<String> supplier = () -> "hello";
        System.out.println(supplier.get());
    }

    /**
     * 演示Consumer<T>的使用
     * Consumer<T> : 消费型接口
     * 方法：void accept(T t),消耗参数，但是没有返回
     * Consumer可以使用andThen来对参数进行组合处理
     */
    public static void testConsumer() {
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("hello html");
    }

}
