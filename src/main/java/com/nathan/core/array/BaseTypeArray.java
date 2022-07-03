package com.nathan.core.array;

/**
 * 数组引用类型
 *
 * 1. 数组是多个相同数据类型数据的组合，实现对这些数据的统一管理
 * 2. 数组中的元素可以是任何数据类型，包括基本数据类型和引用类型，但不能混用
 * 3. 数组创建后，如果没有赋值，JVM会赋默认值
 *    * 整数: 默认值0
 *    * 浮点数: 默认值0.0
 *    * 字符: \u0000
 *    * 布尔: false
 *    * 引用: null
 * 4. 使用数组步骤:
 *    1) 声明数组并开辟空间
 *    2) 给数组各个元素赋值
 *    3) 下标访问使用数组元素
 * 5. 数组下标从0开始
 * 6. 数组下标需要在数组大小范围内使用，不然运行时报数组下标越界
 * 7. 数组属于引用类型，数组行数据是对象(Object)
 */
public class BaseTypeArray {

    public static void readArr(int[] arr) {
        if (null == arr) return;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "元素是: " + arr[i]);
        }
    }

    public static void main(String[] args) {
        // 数组的初始化
        // 动态初始化
        int[] arr1 = new int[2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        readArr(arr1);

        // 静态初始化
        int[] arr2 = {0, 1, 2};
        readArr(arr2);
    }
}
