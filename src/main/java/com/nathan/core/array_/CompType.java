package com.nathan.core.array_;

import java.util.Arrays;
import java.util.Collections;
import java.util.SplittableRandom;

/**
 * 数组排序
 *    >> 1) Arrays.sort()
 *    >> 2)
 */
public class CompType implements Comparable<CompType> {

    int i;
    int j;

    private static int count = 1;

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        String result = "[i = " + i + ", j = " + j + "]";
        if (count++ % 3 == 0) {
            result += "\n";
        }
        return result;
    }

    @Override
    public int compareTo(CompType o) {
        // o not null
        return Integer.compare(i, o.i);
    }

    private static SplittableRandom r = new SplittableRandom(47);

    public static CompType get() {
        return new CompType(r.nextInt(100), r.nextInt(100));
    }

    public static void main(String[] args) {
        CompType[] a = new CompType[12];
        Arrays.setAll(a, n -> get());
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
}
