package com.study.socket;

import java.io.IOException;
import java.net.*;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-27 15:15
 */
public class UdpSendDemo {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket=new DatagramSocket();
            byte [] bb="hello world".getBytes();
            DatagramPacket datagramPacket=new DatagramPacket(bb,bb.length, InetAddress.getByName("192.168.124.17"),10000);
            datagramSocket.send(datagramPacket);
            datagramSocket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
