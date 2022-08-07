package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBufferedInputStream {

    @Test
    public void test01() {
        String tmp = "E:\\tmp\\text01.txt";
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(tmp))) {
            byte[] bytes = new byte[1024];
            int read = bufferedInputStream.read(bytes);
            System.out.println(new String(bytes, 0, read));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
