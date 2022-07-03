package com.nathan.core.array;

/**
 * 冒泡排序
 */
public class BubbleSorted {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 23, 54, 36, 76, 12, 22};
        BaseTypeArray.readArr(arr1);

        // 冒泡排序
        for (int i = 1; i < arr1.length - 1; i++) { // 次数
            for (int j = 1; j < arr1.length - i + 1; j++) { // 位置交换
                if (arr1[j] < arr1[j - 1]) {
                    int tmp = arr1[j];
                    arr1[j] = arr1[j - 1];
                    arr1[j - 1] = tmp;
                }
            }
        }
        System.out.println("=========");
        BaseTypeArray.readArr(arr1);
    }
}
