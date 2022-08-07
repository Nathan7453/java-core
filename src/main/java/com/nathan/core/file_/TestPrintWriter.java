package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.PrintWriter;

public class TestPrintWriter {

    @Test
    public void test01() {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("中国，你好!!");
        pw.close();
    }
}
