package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class TestFileOutputStream {

    @Test
    public void test01() throws FileNotFoundException {
        String tmp = "E:\\tmp\\text01.txt";
        try(FileOutputStream fileOutputStream = new FileOutputStream(tmp)) {
//        try(FileOutputStream fileOutputStream = new FileOutputStream(tmp, true)) {
            String data = "hello world!";
            fileOutputStream.write(data.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
