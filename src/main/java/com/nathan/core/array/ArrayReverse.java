package com.nathan.core.array;

/**
 * 数组反转
 */
public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        BaseTypeArray.readArr(arr1);

        // 反转
        int tmp;
        for (int i = 0; i < arr1.length / 2; i++) {
            tmp = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = arr1[i];
            arr1[i] = tmp;
        }
        System.out.println("==========");
        BaseTypeArray.readArr(arr1);
    }

}
