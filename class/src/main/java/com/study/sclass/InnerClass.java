package com.study.sclass;

/**
 * @Author Frank
 * @Description 内部类的访问规则;
 * 内部类可以直接访问外部类中的成员，包括私有的。
 * 之所以可以直接访问外部类中的成员，是因为内部内中持有一个外部类的引用，格式 外部类名.this
 * 外部类要访问内部内必须建立内部类对象。
 *
 *
 *
 * 1内部类定义在局部时，不可以被成员修饰符修饰
 * 2可以直接访问外部类中的成员，因为还持有外部类中的引用
 * 但是不可以访问它所在的局部中的变量，只能访问被final修饰的局部变量。(jdk6以下)
 *
 * @Date: Create in  2019/3/8 4:17 PM
 */


class Outer {
    private int x = 3;

    class Inner {
        int x = 3;

        void function() {
            System.out.println(Outer.this.x);
        }
    }

}

class Outer2{
    int x=3;

     void method(final int a){

         class Inner{
             void function(){
                 System.out.println(a);
             }
         }

         new Inner().function();
     }

}

public class InnerClass {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer().new Inner();
        System.out.println(inner.x);
        Outer2 outer2=new Outer2();
        outer2.method(6);
        outer2.method(4);
    }

}
