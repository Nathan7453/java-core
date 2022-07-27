package com.nathan.core.generic_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * 随机选取list中的元素
 *
 * @param <T>
 */
public class RandomList<T> extends ArrayList<T> {
    private final Random r = new Random(47);

    public T select() {
        return get(r.nextInt(size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        rs.addAll(Arrays.asList(("The quick brown fox jumped over " +
                "the lazy brown dog").split(" ")));

        IntStream.range(0, 11)
                .forEach(i -> System.out.println(rs.select() + " "));
    }
}
