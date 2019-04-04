package com.study.io;

import java.io.*;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-22 09:19
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("/Users/frank/iCloud 云盘（归档） - 2/1/xxxxxxx/SMD-136.mp4"));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("SMD-136.mp4"));
            int by = 0;
            while ((by = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(by);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
