package com.study.sclass;

/**
 * @Author Frank
 * @Description 　　这道题目主要考察的是类继承时构造器的调用顺序和初始化顺序。
 *                  要记住一点：父类的构造器调用以及初始化过程一定在子类的前面。
 *                  由于Circle类的父类是Shape类，所以Shape类先进行初始化，然后再执行Shape类的构造器。
 *                  接着才是对子类Circle进行初始化，最后执行Circle的构造器。
 * @Date: Create in  2019-03-21 10:47
 */
public class TestDemo2 {
    public static void main(String[] args) {
        new Circle();
    }
}

class Draw {

    public Draw(String type) {
        System.out.println(type + " draw constructor");
    }
}

class Shape {
    private Draw draw = new Draw("shape");

    public Shape() {
        System.out.println("shape constructor");
    }
}

class Circle extends Shape {
    private Draw draw = new Draw("circle");

    public Circle() {
        System.out.println("circle constructor");
    }
}
