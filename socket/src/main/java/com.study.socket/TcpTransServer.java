package com.study.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-28 14:55
 */
public class TcpTransServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(10005);
            Socket socket=serverSocket.accept();
            String ip=socket.getInetAddress().getHostAddress();
            System.out.println(ip+"connected..");
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            PrintWriter printWriter=new PrintWriter(socket.getOutputStream(),true);
            String line=null;
            while((line=bufferedReader.readLine())!=null){
                //bufferedWriter.write(line.toUpperCase());
                //bufferedWriter.newLine();
                //bufferedWriter.flush();
                printWriter.println(line.toUpperCase());
            }
            //bufferedWriter.close();
            printWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
