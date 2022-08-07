package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestFileReader {

    @Test
    public void test01() {
        String tmp = "E:\\tmp\\text01.txt";

        try(FileReader fileReader = new FileReader(tmp)) {
            int read = 0;
            while ((read = fileReader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
