package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileCopy {

    @Test
    public void test01() {
        String in = "E:\\tmp\\text01.txt";
        String out = "E:\\tmp\\text02.txt";
        try(FileInputStream fileInputStream = new FileInputStream(in);
            FileOutputStream fileOutputStream = new FileOutputStream(out)) {
            int readLen = 0;
            byte[] bytes = new byte[1024];
            while ((readLen = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
