package com.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-21 15:54
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("demo2.txt");
            byte [] a=new byte[1024];
            int length=0;
            while((length=fileInputStream.read())!=-1){
                System.out.println(new String(a,0,length));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
