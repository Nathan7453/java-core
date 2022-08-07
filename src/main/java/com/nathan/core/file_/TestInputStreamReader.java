package com.nathan.core.file_;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestInputStreamReader {

    /**
     * 字符流默认处理UTF-8编码的文件内容
     * 对于非UTF-8编码读取会出现乱码
     * 解决该情况需要使用转换流
     */

    @Test
    public void test01() {
        String tmp = "E:\\tmp\\text01.txt";
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream(tmp), "UTF-8")) {
            BufferedReader br = new BufferedReader(isr);
            System.out.println(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
