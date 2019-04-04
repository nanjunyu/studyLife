package com.study.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-27 16:19
 */
public class UdpReceDemo {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(10000);
            byte[] bb = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bb, bb.length);
            datagramSocket.receive(dp);
            String ip = dp.getAddress().getHostAddress();
            String data = new String(dp.getData(), 0, dp.getLength());
            int port = dp.getPort();
            System.out.println("ip:" + ip + "\ndate:" + data + "\nport:" + port);
            datagramSocket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
