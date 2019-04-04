package com.study.io;

import java.io.*;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-20 17:50
 */
public class BufferDemo {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("demo2.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("demo2_copy.txt"));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();

            }
        } catch (FileNotFoundException e) {
           throw new RuntimeException("读写失败");
        } catch (IOException e) {
            throw new RuntimeException("读写失败");
        }finally {
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                   throw new RuntimeException("读写失败");
                }
            }
            if(bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException("读写失败");
                }
            }
        }
    }
}
