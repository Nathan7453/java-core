package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestFileInputStream {

    @Test
    public void test01() throws FileNotFoundException {
        String tmp = "E:\\tmp\\text01.txt";
        FileInputStream fileInputStream = new FileInputStream(tmp);
        try(fileInputStream) {
            byte[] bytes = new byte[1024];
            int read = fileInputStream.read(bytes);
            System.out.println(new String(bytes, 0, read));
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
