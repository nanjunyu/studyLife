package com.study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-21 15:47
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream=null;
        try {
             fileOutputStream=new FileOutputStream("demo.txt");
            fileOutputStream.write("20190321".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
