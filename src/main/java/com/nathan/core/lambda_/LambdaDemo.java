package com.nathan.core.lambda_;

import java.util.Comparator;

/**
 * lambda表达式使用
 */
public class LambdaDemo {

    public static void main(String[] args) {
        Comparator<Integer> cp = Integer::compareTo;
        System.out.println(cp.compare(1, 2));
    }
}
