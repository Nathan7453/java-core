package com.nathan.core.string_;

/**
 * 字符串在内存布局
 *
 * >> [①]常量相加，看常量池
 * >> [②]变量相加，看堆
 */
public class StringInCache {

    public static void main(String[] args) {
//        String str = "ABC" + "abc"; // ① 常量池中只有一个"ABCabc"(编译器优化结果)

        String a = "ABC";
        String b = "abc";
        String c = a + b; // ② c指向堆中地址，常量池中有"ABCabc"

        // c = a + b; 底层执行逻辑分析
        // 1) 先创建 StringBuilder 对象
        // 2) StringBuilder.append("ABC")
        // 3) StringBuilder.append("abc")
        // 4) StringBuilder.toString()
    }
}
