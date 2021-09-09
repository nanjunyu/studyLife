package com.study.jvm;

/**
 * @author nanjunyu
 * @date Created in 2021/9/9
 */
public class StackTest {

    //静态变量 类的信息
    public static int x=666;

    //堆里面的类的类元信息指向堆

    //静态变量 类的信息 → 指针指向堆
    public static People people=new People();


    //每一个方法对应一个栈帧内存
    private int compute(){
        //存放局部变量表、操作数栈、动态链接、方法出口
        int a=1;
        int b=2;

        //程序计数器

        //值装载操作数栈中，准备计算
        //执行加法。重新压到操作数栈中
        //10 压到操作数栈里面来，
        // 执行乘法
        //30 压到操作数栈里面来
        //int 类型的值存入局部变量3   出栈给c

        int c=(a+b)*10;
        return c;
    }

    public static void main(String[] args) {
        //开启一个线程 ，单独开辟内存区域，独享私有
        //局部变量 math 是一个new对象 分配到堆，

        StackTest math=new StackTest();
        System.out.println(math.compute());
        new Thread().start();
    }
}
