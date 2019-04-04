package com.study.socket;

import java.io.*;
import java.net.Socket;

/**
 * @Author Frank
 * @Description 需求建立一个文本转换器
 *              客户端给服务端发送文本，服务端会将文本转换为大写返回给客户端
 *              而且服务端可以不间断的转换，知道客户端发送over的时候结束。
 *
 * @Date: Create in  2019-03-28 11:00
 */
public class TcpTransClient {
    public static void main(String[] args) {
        short i=0;
        try {
            short a=128;
            byte b= (byte) a;
            System.out.println(a);
            System.out.println(b);
            Socket socket=new Socket("192.168.124.17",10005);
            //定义读取键盘数据流对象
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            //定义目的将数据写入到socket输出流发送给服务端
            //BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            PrintWriter printWriter=new PrintWriter(socket.getOutputStream(),true);

            BufferedReader bufferedReader1=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line=null;
            while((line=bufferedReader.readLine())!=null){
                if("over".equals(line)){
                    break;
                }
               // bufferedWriter.write(line);
                //bufferedWriter.newLine();
               // bufferedWriter.flush();
                printWriter.println(line);
                String str=bufferedReader1.readLine();
                System.out.println("server:"+str);
            }
            bufferedReader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
