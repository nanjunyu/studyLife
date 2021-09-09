package com.study.jvm;

/**
 * @author nanjunyu
 * @date Created in 2021/9/9
 */
public class StackOverflowError {

    //- Xss 设置单个线程栈大小，一般默认512~1024kb

    static int count =0;

    static void redo(){
        count++;
        redo();
    }
    public static void main(String[] args) {
        try {
            redo();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("~~~~~~~~~~~~~~"+count);
        }
    }
}
