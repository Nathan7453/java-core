package com.nathan.core.array_;

import java.util.Arrays;

/**
 * 使用传统Arrays.setAll()替换Stream
 * 速度有高要求，则使用Arrays.parallelSetAll()
 *
 * @link: com.nathan.core.array_.CountUpward
 */
public class ParallelSetAll {
    static final int SIZE = 100_000_000;

    static void longArray() {
        long[] la = new long[SIZE];
        Arrays.setAll(la, new Rand.Plong()::get);
        Arrays.parallelSetAll(la, new Rand.Plong()::get);
    }

    public static void main(String[] args) {
        longArray();
    }
}
