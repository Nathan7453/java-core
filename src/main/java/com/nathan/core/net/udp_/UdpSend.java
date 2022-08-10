package com.nathan.core.net.udp_;

import java.io.IOException;
import java.net.*;

public class UdpSend {
    public static void main(String[] args) {
        try(DatagramSocket socket = new DatagramSocket(7777)) {
            byte[] bytes = "你吃饭了吗？".getBytes();
            DatagramPacket packet = new DatagramPacket(
                    bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 8888);
            socket.send(packet);
            System.out.println("客户端退出");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
