package com.nathan.core.stream_;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Java8之前实现和 {@link Randoms} 功能一样的声明式编程。
 */
public class ImperativeRandoms {

    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> rints = new TreeSet<>();
        while (rints.size() < 7) {
            int r = rand.nextInt(20);
            if (r < 5) continue;
            rints.add(r);
        }
        System.out.println(rints);
    }
}
