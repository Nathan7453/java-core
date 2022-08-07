package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {

    @Test
    public void test01() {
        String tmp = "E:\\tmp\\text03.txt";
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tmp))) {
            bufferedWriter.write("这是啥。。。");
            bufferedWriter.newLine();
            bufferedWriter.write("没有啥。。。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
