package com.nathan.core.array;

/**
 * 数组拷贝
 *
 * 数组声明在栈空间，开辟空间在堆中；栈中存着指向堆空间地址
 * ┌────── 栈空间 ──────┐     ┌────── 堆空间 ──────┐
 * │ arr1 [0x111000] ──┼────>│ [1] 0x111000      │
 * └───────────────────┘     │ [2] 0x111001      │
 *                           └───────────────────┘
 */
public class ArrayCopy {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        BaseTypeArray.readArr(arr1);
        System.out.println("==========");
        BaseTypeArray.readArr(arr2);

        // native方法提供数组拷贝[建议使用]
        System.arraycopy(arr1, 0,  arr2, 0, arr1.length);
        System.out.println("==========");
        BaseTypeArray.readArr(arr2);
    }
}
