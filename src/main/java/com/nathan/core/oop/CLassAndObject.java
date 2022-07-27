package com.nathan.core.oop;

/**
 * 类与对象
 *
 * 1）内存分配机制
 *    1. 栈: 一般存放基本数据类型（局部变量）
 *    2. 堆: 存放对象（数组）
 *    3. 方法区: 常量池（常量，比如字符串），类加载信息
 *    4. 示意图(目录下的图片: 类与对象的内存分配.png)
 */
public class CLassAndObject {

    public static void main(String[] args) {
        Person person = new Person();
        person.age = 20;
        person.name = "小明";
    }

    static class Person {
        int age;
        String name;

        public void speak() {
            System.out.println("speak....");
        }
    }
}
