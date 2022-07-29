package com.nathan.core.string_;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 二进制文件的字节格式化为十六进制
 */
public class Hex {

    public static String format(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b : data) {
            if (n % 16 == 0) {
                result.append(String.format("%05X: ", n));
            }
            result.append(String.format("%02X ", b));
            n++;
            if (n % 16 == 0) result.append("\n");
        }
        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            String path = "build\\classes\\java\\main\\com\\nathan\\core\\string_\\Hex.class";
            System.out.println(format(Files.readAllBytes(Paths.get(path))));
        } else {
            System.out.println(format(Files.readAllBytes(Paths.get(args[0]))));
        }
    }
}
