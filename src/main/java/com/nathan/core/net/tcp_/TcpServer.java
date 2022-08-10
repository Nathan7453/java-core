package com.nathan.core.net.tcp_;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class TcpServer {

    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(9999)) {
//            InetSocketAddress address = new InetSocketAddress(9898);
//            server.bind(address);
            System.out.println("启动服务端");
            while (true) {
                Socket client = server.accept();
                if (null != client) {
                    new Thread(() -> {
                        System.out.println("客户端: " + client.getInetAddress());
                        try {
                            InputStream is = client.getInputStream();
                            System.out.println(is.getClass());
                            byte[] bytes = is.readAllBytes();
                            System.out.println(new String(bytes, "UTF-8"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }).start();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
