package com.nathan.core.array_;

import java.util.Arrays;

/**
 * 数组比较
 */
public class ComparingArrays {

    public static final int SZ = 15;

    static String[][] twoArray() {
        String[][] md = new String[5][];
        Arrays.setAll(md, String[]::new);
        for (String[] strings : md) {
            Arrays.setAll(strings, new Rand.String()::get);
        }
        return md;
    }

    public static void main(String[] args) {
        String[][] md1 = twoArray();
        String[][] md2 = twoArray();
        System.out.println(Arrays.deepToString(md1));
        System.out.println(Arrays.deepToString(md2));
        System.out.println("deepEquals(md1, md2): " + Arrays.deepEquals(md1, md2));
        System.out.println("md1 == md2: " + Arrays.equals(md1, md2));
        md1[4][1] = "#$#$#$#";
        System.out.println(Arrays.deepToString(md1));
        System.out.println("deepEquals(md1, md2): " + Arrays.deepEquals(md1, md2));
    }
}
