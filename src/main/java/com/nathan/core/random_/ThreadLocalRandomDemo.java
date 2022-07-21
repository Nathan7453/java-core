package com.nathan.core.random_;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 随机数的生成器隔离到当前线程
 *   >> 多个线程初始ThreadLocalRandom的时间完全一致，
 *   >> 在调用方法和过程相同的情况下，产生的随机序列也是相同的；
 *   >> 在一定程度上“-Djava.util.secureRandom=true”可以规避此问题。
 *
 *   >> ThreadLocalRandom并没有使用ThreadLocal来支持内部数据存储
 *   >> 使用UnSafe操作当前Thread对象引用中seed属性的内存地址并进行数据操作
 */
public class ThreadLocalRandomDemo {

    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
    }
}
