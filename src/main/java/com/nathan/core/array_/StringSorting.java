package com.nathan.core.array_;

import java.util.Arrays;
import java.util.Collections;

/**
 * 字符串排序
 */
public class StringSorting {

    public static void main(String[] args) {
        String[] sa = new Rand.String().array(20);
        System.out.println("Before sort: " + Arrays.toString(sa));
        Arrays.sort(sa);
        System.out.println("After sort: " + Arrays.toString(sa));
        Arrays.sort(sa, Collections.reverseOrder());
        System.out.println("Reverse sort: " + Arrays.toString(sa));
        Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Case-insensitive sort: " + Arrays.toString(sa));
    }
}
