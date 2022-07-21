package com.nathan.core.array_;

import java.util.Arrays;

/**
 * Arrays.copy() 和 Arrays.copyOf() 使用
 */
public class ArrayCopying {
    public static final int SZ = 15;

    public static void main(String[] args) {
        Sub[] d = new Sub[SZ/2];
        Arrays.setAll(d, Sub::new);

        // sub -> sup √
        Sup[] b = Arrays.copyOf(d, d.length, Sup[].class);

        // sup(原本sub) -> sub √
        Sub[] d2 = Arrays.copyOf(b, b.length, Sub[].class);

        Sup[] b2 = new Sup[SZ/2];
        Arrays.setAll(b2, Sup::new);

        try {
            // sup -> sub: ArrayStoreException
            Sub[] d3 = Arrays.copyOf(b2, b2.length, Sub[].class);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Sup { // 父类
    private int id;

    Sup(int n) {
        id = n;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + id;
    }
}

class Sub extends Sup { // 子类
    Sub(int n) {
        super(n);
    }
}