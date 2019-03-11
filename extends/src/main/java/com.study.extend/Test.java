package com.study.extend;

/**
 * @Author Frank
 * @Description
 * 在多态中非静态成员函数的特点，在编译时期: 参阅引用型变量所属的类中是否有调用的方法。如果有编译通过该，如果没有则编译失败。
 * 在运行期间: 参阅对象所属的类中是否有调用的方法。
 * 简单总结就是:成员函数在多态调用时，编译看左边，运行看右边。
 *
 * 在多态中，静态成员函数的特点，无论编译还是运行都参考左边。
 *
 * 在多态中成员变量的特点，无论编译和运行都参考左边(引用变量所属的类)。
 * @Date: Create in  2019/3/7 4:12 PM
 */
public class Test {

    /*public static void main(String[] args) {
        Cat cat=new Cat();
        Animal dog=new Dog();
        function(cat);
        function(dog);
    }*/

    private static  void function(Animal a){
        a.eat();
    }


    public static void main(String[] args) {
        Fu f=new Zi();
        f.method1();
        f.method2();
    }

}
