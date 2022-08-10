package com.nathan.core.net;

import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

    @Test
    public void test01() throws UnknownHostException {
        // 1. 获取本机InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost); // DESKTOP-R31BBEU/192.168.88.1

        // 2. 根据主机名获取InetAddress对象
        InetAddress byName = InetAddress.getByName("DESKTOP-R31BBEU");
        System.out.println(byName);

        // 3. 根据域名获取 InetAddress 对象
        InetAddress baidu = InetAddress.getByName("www.baidu.com");
        System.out.println(baidu);

        // 4. 通过 InetAddress 对象获取IP地址
        String ip = baidu.getHostAddress();
        System.out.println(ip);

        // 5. 通过 InetAddress 对象获取主机名，没有主机名则返回域名
        String hostName = baidu.getHostName();
        System.out.println(hostName);
    }
}
