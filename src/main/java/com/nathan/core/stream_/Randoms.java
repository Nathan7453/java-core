package com.nathan.core.stream_;

import java.util.Random;

/**
 * 随机生成5~20范围内的整数
 * 不重复
 * 截取有限个
 * 有序
 *
 * {@link ImperativeRandoms}
 */
public class Randoms {
    public static void main(String[] args) {
        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
    }
}
