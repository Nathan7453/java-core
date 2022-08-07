package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestPrintStream {

    @Test
    public void test01() {
        PrintStream out = System.out;
        out.print("输出到终端啦...");
        out.close();
    }

    @Test
    public void test02() {
        try {
            System.setOut(new PrintStream("E:\\tmp\\print.txt"));
            System.out.println("Hello PrintStream!!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
