package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

public class TestStandardIO {

    @Test
    public void test01() {
        System.out.println(System.in.getClass());
        System.out.println(System.out);
        System.out.println(System.err);
    }
}
