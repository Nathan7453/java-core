package com.nathan.core.array;

/**
 * 杨辉三角
 *
 * 1. 第一行有1个元素，第n行有n个元素
 * 2. 第n行的第一个元素和最后一个元素都是1
 * 3. 从第三行开始，非第一个元素和最后一个元素，有
 *    arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
 */
public class YangHui {

    public static void main(String[] args) {
        int n = 10;
        int[][] arr = new int[n][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = 1;
            arr[i][arr[i].length - 1] = 1;

            if (i > 1) {
                for (int j = 1; j < arr[i].length - 1; j++) {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }

        for (int[] one : arr) {
            for (int j : one) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
