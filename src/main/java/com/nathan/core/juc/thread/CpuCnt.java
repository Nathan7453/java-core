package com.nathan.core.juc.thread;

/**
 * 程序获取CPU个数
 *
 * 并发: 单核切换执行
 * 并行: 多核同时执行
 */
public class CpuCnt {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        final int cnt = rt.availableProcessors();
        System.out.println("当前系统cpu个数: " + cnt);
    }

}
