package com.nathan.core.net.udp_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceive {
    public static void main(String[] args) {
        try(DatagramSocket socket = new DatagramSocket(8888)) {
            byte[] bytes = new byte[64 * 1024];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            socket.receive(packet);
            int len = packet.getLength();
            System.out.println("接收到数据: " + new String(bytes, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
