package com.nathan.core.array_;

import java.util.Arrays;

/**
 * Arrays.setAll() 的简单使用
 */
public class SimpleSetAll {

    public static final int SZ = 8;
    static int val = 1;
    static char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static char getChar(int n) {
        return chars[n];
    }

    public static void main(String[] args) {
        int[] ia = new int[SZ];
        double[] da = new double[SZ];
        Arrays.setAll(ia, n -> n);
        Arrays.setAll(da, n -> n);

        Arrays.setAll(ia, n -> val++);
        Arrays.setAll(da, n -> val++);

        Bob[] ba = new Bob[SZ];
        Arrays.setAll(ba, Bob::new);

        Character[] ca = new Character[SZ];
        Arrays.setAll(ca, SimpleSetAll::getChar);
    }
}

class Bob {
    final int id;
    Bob(int n) {
        id = n;
    }

    @Override
    public String toString() {
        return "Bob" + id;
    }
}
