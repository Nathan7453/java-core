package com.nathan.core.array;

/**
 * 练习2
 *
 * 已知升序数组: {3, 5, 7, 10, 30}
 * 新插入一个元素11: {3, 5, 7, 10, 11, 30}
 */
public class Exercise02 {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 10, 30};
        int[] result = new int[arr.length + 1];
        int target = 100;

        boolean insert = false;
        for (int i = 0; i < arr.length; i++) {
            if (insert) result[i + 1] = arr[i];
            else {
                if (target < arr[i]) {
                    result[i] = target;
                    result[i + 1] = arr[i];
                    insert = true;
                } else {
                    result[i] = arr[i];
                }
            }
        }

        if(!insert) {
            result[result.length - 1] = target;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }
        System.out.println();
    }
}
