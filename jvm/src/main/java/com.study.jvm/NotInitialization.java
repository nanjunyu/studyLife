package com.study.jvm;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2019/2/25 2:51 PM
 */
public class NotInitialization {

    /**
     * 运行之后只会输出 SuperClass init！而不会输出SubClass init,对于静态代码字段，只有直接定义这个字段的类才会被初始化
     * ，因此通过其子类来引用父类中定义的静态字段，只会触发其父类的初始化。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(SubClass.value);

        SuperClass [] sca =new SuperClass[10];

        System.out.println(ConstClass.a);
    }

}
