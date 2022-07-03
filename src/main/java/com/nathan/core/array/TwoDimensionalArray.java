package com.nathan.core.array;

/**
 * 二维数组
 *
 * 1. 二维数组的每一个元素都是一维数组(两层for循环可以遍历)
 * 2. 二维数组元素的个数: arr.length
 * 3. 访问第(i + 1)纬数组的第(j + 1)个值: arr[i][j]
 *
 * ┌────── 栈空间 ──────┐     ┌──────── (二维数组)堆空间 ───────────┐
 * │ arr [0x111000] ───┼────>│ arr[0]-[0x111000]────>┌─┬─┬─┬─┬─┐ │
 * └───────────────────┘     │ arr[1]-[0x111001]────>├─┼─┼─┼─┼─┤ │
 *                           │                       └─┴─┴─┴─┴─┘ │
 *                           │                        0 1 2 3 4  │
 *                           └───────────────────────────────────┘
 * int[][] arr1 = new int[2][3]; // 二维数组的一维数组元素个数确定
 * int[][] arr2 = new int[2][]; // 二维数组的一维数组元素个数不确定，仅创建给二维数组开辟空间，元素的一维数组没有开辟
 *         arr2[i] = new int[j]; // 二维数组的一维数组元素开辟空间
 */
public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5, 6, 8, 10},
            {12, 34, 56, 68, 80, 100},
            {11, 32, 53, 64, 85, 106},
            {13, 33, 53, 63, 83, 103},
            {17, 37, 57, 67, 87, 107}
        };

        for (int i = 0; i < arr.length; i++) { // int[] 这样的数组的总个数
            System.out.print("地址: " + arr[i]);
            for (int j = 0; j < arr[i].length; j++) { // 一维数组的个数
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("======");
        // 增强for循环
        for (int[] one : arr) {
            for (int i : one) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
