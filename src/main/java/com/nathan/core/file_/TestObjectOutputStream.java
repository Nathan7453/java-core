package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestObjectOutputStream {
    @Test
    public void test01() {
        String tmp = "E:\\tmp\\obj01.txt";
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(tmp))) {
            int i = 100;
            objectOutputStream.writeInt(i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
