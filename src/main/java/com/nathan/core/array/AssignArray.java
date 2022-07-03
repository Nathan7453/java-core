package com.nathan.core.array;

/**
 * 数组赋值
 */
public class AssignArray {

    public static void main(String[] args) {
        // 基本数据类型赋值 -- (值拷贝)
        int i1 = 10;
        int i2 = i1;
        i2 = 20;
        System.out.println("i1 = " + i1 + "; i2 = " + i2);

        // 数组赋值 -- (引用拷贝/地址拷贝)
        // 两个数组的元素变更会联动影响
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = arr1;
        arr2[2] = 10;
        BaseTypeArray.readArr(arr1);
        System.out.println("============");
        BaseTypeArray.readArr(arr2);
    }
}
