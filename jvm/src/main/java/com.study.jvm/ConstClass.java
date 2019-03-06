package com.study.jvm;

/**
 * @Author: Frank
 * @Description:  运行之后不会输出 ConstClass init 这是因为a储存到了常量池中
 * @Date: Create in  2019/2/25 3:07 PM
 */
public class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }

    public static final String a="hello world!";

}
