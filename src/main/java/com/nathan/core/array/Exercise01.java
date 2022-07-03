package com.nathan.core.array;

/**
 * 练习01
 */
public class Exercise01 {

    public static void main(String[] args) {
        int[] x, y[];
        x = new int[1];
        y = new int[1][];
        y[0] = new int[1];

        // 考虑是否正确，仅需要考虑类型是否匹配
//        x[0] = y;
        y[0] = x;
//        y[0][0] = x;
//        x[0][0] = y;
        y[0][0] = x[0];
//        x = y;

        String[] str = new String[]{"1", "2"};
    }
}
