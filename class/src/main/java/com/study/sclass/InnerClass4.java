package com.study.sclass;

/**
 * @Author Frank
 * @Description  匿名内部内：
 *  1: 匿名内部类其实就是内部类的简写格式。
 *  2: 定义匿名内部类的前提:
 *      内部类必须是继承一个类或者实现接口。
 *  3: 匿名内部类的格式: new父类或者接口 定义类的内容
 *  4: 其实匿名内部类就是一个匿名子类对象，而且这个对象有点胖，可以理解为带内容的对象。
 *  5: 匿名内部类中定义的方法最好不要超过3个。
 * @Date: Create in  2019/3/11 3:58 PM
 */
public class InnerClass4 {

    int x=3;
    abstract  class AbsDemo{
       abstract void show();
    }

    public void function() {
        new AbsDemo(){
            @Override
            void show(){
                System.out.println(x);
            }
        }.show();
    }


    public static void main(String[] args) {
        InnerClass4 class4=new InnerClass4();
        class4.function();
    }


}
