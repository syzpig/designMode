package com.syz.designMode.lambda.demo4;

import java.util.Objects;

/**
 *  @author: syz
 *  @Date: 2020/12/9 10:18
 *  @Description:  消费性接口：Consumer   只接收一个参数t，但是没有返回值。
 */


public interface Consumer<T> {
    void accept(T t);

    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }

}
