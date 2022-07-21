package com.nathan.core.array_;

import java.util.stream.LongStream;

/**
 * 递增数据填充long行数组
 */
public class CountUpward {

    static long[] fillCounted(int size) {
        return LongStream.iterate(0, i -> i + 1)
                .limit(size).toArray();
    }

    public static void main(String[] args) {
        long[] l1 = fillCounted(20);
        long[] l2 = fillCounted(1_000_000_000); // OOM
    }
}
