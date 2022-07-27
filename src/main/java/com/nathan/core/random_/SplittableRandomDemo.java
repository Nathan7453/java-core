package com.nathan.core.random_;

import java.util.Random;
import java.util.SplittableRandom;

/**
 * 主要适用于Fork/join形式的跨线程操作中
 *
 *    >> 具有相同seed的不同SplittableRandom实例或者同一个SplittableRandom，
 *    >> 多次运行结果是一致的。这和Random是一致的。
 *
 *    >> 非线程安全，不能被并发使用
 */
public class SplittableRandomDemo {

    public static void main(String[] args) throws InterruptedException {
        sameSeed();
//        System.out.println("第一段");
//        SplittableRandom random = new SplittableRandom(100);
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                SplittableRandom _random = random.split();
//                for (int i=0; i < 5; i++) {
//                    System.out.println("---" + _random.nextInt(100));
//                }
//            }
//        });
//        thread.start();
//        thread.join();
//
//        for (int i=0; i < 5; i++) {
//            System.out.println("+++" + random.nextInt(100));
//        }
//
//        System.out.println("第二段");
//        SplittableRandom _random = new SplittableRandom(100);
//        for (int i=0; i < 10; i++) {
//            System.out.println("..." + _random.nextInt(100));
//        }
    }

    /**
     * 具有相同seed的不同SplittableRandom实例或者同一个SplittableRandom
     * 多次运行结果是一致的
     */
    private static void sameSeed() {
        SplittableRandom random = new SplittableRandom(100);
        System.out.println(random.nextInt(10) + "," + random.nextInt(30) + "," + random.nextInt(50));

        random = new SplittableRandom(100);
        System.out.println(random.nextInt(10) + "," + random.nextInt(30) + "," + random.nextInt(50));

        random = new SplittableRandom(100);
        System.out.println(random.nextInt(10) + "," + random.nextInt(30) + "," + random.nextInt(50));
    }
}
