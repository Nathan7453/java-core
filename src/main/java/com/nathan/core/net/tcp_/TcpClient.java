package com.nathan.core.net.tcp_;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

import static java.net.InetAddress.getLocalHost;

public class TcpClient {
    public static void main(String[] args) {
        try(Socket socket = new Socket(getLocalHost(), 9999)) {
//            InetSocketAddress address = new InetSocketAddress(9898);
//            socket.connect(address);
            OutputStream os = socket.getOutputStream();
            String msg = "hello";
            os.write(msg.getBytes(StandardCharsets.UTF_8));
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("客户端退出");
    }
}
