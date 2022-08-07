package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

    @Test
    public void test01() {
        String tmp = "E:\\tmp\\text03.txt";
        try(FileWriter fileWriter = new FileWriter(tmp)) {
//        try(FileWriter fileWriter = new FileWriter(tmp, true)) {
            fileWriter.write("中国");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
