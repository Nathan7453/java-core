package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        String path = "E:\\tmp\\text01.txt";
        File file = new File(path);
        try {
            boolean n = file.createNewFile();
            System.out.println(n);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test01() throws IOException {
        String path = "E:\\tmp\\text01.txt";
        File file = new File(path);

        System.out.println(file.isAbsolute());
        System.out.println(file.getCanonicalPath());
    }
}
