package com.nathan.core.juc.thread;

/**
 * 线程Thread使用
 *
 * 使用场景:
 * 1. 每隔一秒输出线程执行的次数
 * 2. 在上面的基础上，给执行的次数添加限定，当次数达到20，则推出线程
 * 3. 使用
 */
public class ThreadUsed {

    public static void main(String[] args) {
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // 执行业务代码
            }
        });
    }

    // 继承Thread，该类可当作线程类使用
    // 实现run()方法，并执行业务代码逻辑
    static class ThreadExtend extends Thread {

        @Override
        public void run() {
            // 执行业务代码
        }
    }
}
