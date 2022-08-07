package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestBufferedReader {

    @Test
    public void test01() {
        String tmp = "E:\\tmp\\text02.txt";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(tmp))) {
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
