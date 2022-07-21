package com.nathan.core.object_;

/**
 * Object 对象探索
 *
 * 1. == 和 equals
 *     1) == : 比较运算符；可判断基本数据类型，也可以判断引用数据类型。
 *       * 基本数据类型: 值是否相等。
 *       * 引用数据类型: 引用地址是否相等。
 *     2) equals : Object类中方法；只能判断引用数据类型。
 *       * Object类中默认判断引用地址是否相等。
 *       * Object子类中重写，则可以判断内容是否相等。
 *
 * 2.hashCode
 *     * 提供具有hash结构的容器的效率
 *     * 两个引用，指向同一对象，则hash值一样，否则不一样。
 *     * hash值与地址相关，但不等价地址。
 *
 * 3.toString
 *     * 打印对象或拼接对象
 *
 * 4.finalize
 *     * 当垃圾收集确定不再有对该对象的引用时，由对象上的垃圾收集器调用
 */
public class ObjectDemo {

    public static void main(String[] args) {
        GcObject gc = new GcObject();
        gc = null;
        System.gc();
    }

    static class GcObject {
        private String name = "测试垃圾回收销毁";

        @Override
        protected void finalize() throws Throwable {
            System.out.println("我被销毁啦。。。");
            super.finalize();
        }
    }
}
