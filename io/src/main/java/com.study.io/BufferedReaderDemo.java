package com.study.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-20 17:44
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("demo2.txt");
            bufferedReader = new BufferedReader(fileReader);
            String a = null;
            while((a=bufferedReader.readLine())!=null){
                System.out.println(a);
            }
           // System.out.println(a);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
