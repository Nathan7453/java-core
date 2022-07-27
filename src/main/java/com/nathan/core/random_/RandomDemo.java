package com.nathan.core.random_;

import java.util.Random;

/**
 * 常用伪随机数生成器
 *   >> 默认使用48位种子、线性同余公式进行修改
 */
public class RandomDemo {

    public static void main(String[] args) {
        sameSeed();
    }

    /**
     * 相同的seed
     *
     * 调用过程一样，其中产生的随机数序列也是完全一样的
     */
    private static void sameSeed() {
        Random random = new Random(100);
        System.out.println(random.nextInt(10) + "," + random.nextInt(30) + "," + random.nextInt(50));

        random = new Random(100);
        System.out.println(random.nextInt(10) + "," + random.nextInt(30) + "," + random.nextInt(50));

        random = new Random(100);
        System.out.println(random.nextInt(10) + "," + random.nextInt(30) + "," + random.nextInt(50));
    }
}
