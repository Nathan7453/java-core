package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestObjectInputStream {


    @Test
    public void test01() {
        String tmp = "E:\\tmp\\obj01.txt";
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(tmp))) {
            int i = objectInputStream.readInt();
            System.out.println(i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
