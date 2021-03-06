package com.book.thinkinginjava.genericity;


/**
 * @comments: 通用的Generator
 * @author: binvy
 * @Date: 2018/4/2
 */
public class BasicGenerator<T>  implements Generator<T> {
    private Class<T> type;
    public BasicGenerator(Class<T> type) {
        this.type = type;
    }
    @Override
    public T next() {
        try {
            return type.newInstance();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<>(type);
    }
}
