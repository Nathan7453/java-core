package com.nathan.core.extends_;

/**
 * extends 内存原理
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son(); // 内存分析
        // 访问顺序: 子类 -> 父类 -> 直至找到允许访问的父类属性
        // 子类属性存在，则直接判断是否可访问，若是私有属性也不会继续访问父类属性
        System.out.println(son.name);
    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa {
    String name = "小头爸爸";
//    private String name = "小头爸爸"; // 编译不通过
    int age = 39;
}

class Son extends Father {
    String name = "大头儿子";
//    private String name = "大头儿子"; // 编译不通过
}
