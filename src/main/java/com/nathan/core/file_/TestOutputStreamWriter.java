package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestOutputStreamWriter {

    @Test
    public void test01() {
        String tmp = "E:\\tmp\\trans01.txt";
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(tmp), "gbk");
             BufferedWriter bw = new BufferedWriter(osw)) {
            bw.write("中国加油!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(tmp), "GBK");
             BufferedReader br = new BufferedReader(isr)) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
