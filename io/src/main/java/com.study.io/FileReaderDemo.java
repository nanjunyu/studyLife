package com.study.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-20 16:52
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        FileReader fileReader=null;
        try {
             fileReader=new FileReader("demo.txt");
             int a=0;
             while((a=fileReader.read())!=-1){
                 System.out.print((char)a);
             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
