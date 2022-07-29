package com.nathan.core.string_;

import java.lang.invoke.StringConcatFactory;

public class WhitherStringBuilder {
    private static final Long MAX_SIZE = 100_000L;
    public static void main(String[] args) {
//        StringConcatFactory.makeConcat()
//        String[] fields = {"aaa", "bbb", "ccc", "ddd"};
//        new WhitherStringBuilder().implicit(fields);

        // 测试测试
        String result = "";
        long start = System.nanoTime();
        for (int i = 0; i < MAX_SIZE; i++) {
            result += i;
        }
        System.out.println("+::: " + (System.nanoTime() - start) / 1000000);

        StringBuilder result2 = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < MAX_SIZE; i++) {
            result2.append(i);
        }
        System.out.println("StringBuilder::: " + (System.nanoTime() - start) / 1000000);
    }

    public String implicit(String[] fields) {
        String result = "";
        for (String field : fields) {
            result += field;
        }
        return result;
    }

    public String explicit(String[] fields) {
        StringBuilder result = new StringBuilder();
        for (String field : fields) {
            result.append(field);
        }
        return result.toString();
    }
}
