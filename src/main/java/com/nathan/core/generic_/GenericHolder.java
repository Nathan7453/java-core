package com.nathan.core.generic_;

/**
 * 泛型
 */
public class GenericHolder<T> {
    private T a;

    public GenericHolder() {
    }

    public T get() {
        return a;
    }

    public void set(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        GenericHolder<Automobile> h3 = new GenericHolder<>();

        h3.set(new Automobile()); // 编译器会进行类型检查
        Automobile a = h3.get(); // 不需要强制类型转换
    }
}

class Automobile {}
