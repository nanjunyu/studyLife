package com.study.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-20 16:33
 */
public class FileWriteDemo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter=new FileWriter("demo.txt",true);
            fileWriter.write("nanjunyu");
            fileWriter.flush();
            fileWriter.write("gaoyashu");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
