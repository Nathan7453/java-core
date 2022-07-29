package com.nathan.core.string_;

/**
 * 字符串
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "这是字符串";
        String str2 = new String("这是字符串");
        System.out.println(str.equals(str2));
        System.out.println(str == str2);
        System.out.println(str2.intern());
        System.out.println(str == str2.intern());
        System.out.println(str2 == str2.intern());
    }
}
