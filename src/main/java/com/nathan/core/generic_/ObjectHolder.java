package com.nathan.core.generic_;

/**
 * 对象持有
 */
public class ObjectHolder {
    private Object a;

    public ObjectHolder(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public static void main(String[] args) {
        ObjectHolder h2 = new ObjectHolder(new Automobile());
        Automobile a = (Automobile)h2.get(); // 需要强制类型转换才能获取具体类型
        h2.set("Not an Automobile"); // 可以放置其他类型，缺少类型检查
        String s = (String)h2.get();
    }
}
