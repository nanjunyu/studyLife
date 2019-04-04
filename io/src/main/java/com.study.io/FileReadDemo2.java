package com.study.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-20 17:16
 */
public class FileReadDemo2 {
    public static void main(String[] args) {
        FileReader fileReader=null;
        try {
             fileReader=new FileReader("/Users/frank/Documents/Frank-MacBookPro_icloud/workspace/sdudyLife/io/src/main/java/com.study.io/1.txt");
            char [] b=new char[1024];
            int a=0;
            while((a=fileReader.read())!=-1){
                System.out.print(new String(b,0,a));
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
