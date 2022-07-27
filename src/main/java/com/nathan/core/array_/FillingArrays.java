package com.nathan.core.array_;

import java.util.Arrays;

/**
 * 测试标准库Arrays中的fill()方法
 *
 *   >> 可以将一个数值复制到数组的所有位置
 */
public class FillingArrays {

    public static void main(String[] args) {
        int size = 6;
        boolean[] a1 = new boolean[size];
//        Arrays.fill(a1, true);
        Arrays.fill(a1, 2, 4, true); // 操作范围: 左闭右开
    }
}
