package com.nathan.core.stream_;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 研究中间操作和终止操作
 */
public class IntStreamDemo {

    public static void main(String[] args) {
        IntStream.range(1, 10)
                .peek(x -> System.out.print("\nA" + x))
                .limit(3)
                .peek(x -> System.out.print("B" + x))
                .forEach(x -> System.out.print("C" + x));

        System.out.println("==============");
        IntStream.range(1, 10)
                .peek(x -> System.out.print("\nA" + x))
                .skip(6)
                .peek(x -> System.out.print("B" + x))
                .forEach(x -> System.out.print("C" + x));
    }
}
