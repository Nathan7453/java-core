package com.nathan.core.net.bio;

import static com.nathan.core.net.IOConstant.BACK_LOG;
import static com.nathan.core.net.IOConstant.DEFAULT_PORT;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketAddress;

/**
 * BIO 服务端演示
 */
public class BIODemo {

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(DEFAULT_PORT, BACK_LOG, null);
        System.out.println("服务启动");
        while (true) {

        }
    }

}
