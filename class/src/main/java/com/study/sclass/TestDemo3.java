package com.study.sclass;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-21 10:51
 */
public class TestDemo3 {
    public static void main(String[] args)  {
        ShapeA shape = new CircleA();
        System.out.println(shape.name);
        shape.printType();
        shape.printName();
    }
}

class ShapeA {
    public String name = "shape";

    public ShapeA(){
        System.out.println("shape constructor");
    }

    public void printType() {
        System.out.println("this is shape");
    }

    public static void printName() {
        System.out.println("shape");
    }
}

class CircleA extends ShapeA {
    public String name = "circle";

    public CircleA() {
        System.out.println("circle constructor");
    }

    @Override
    public void printType() {
        System.out.println("this is circle");
    }

    public static void printName() {
        System.out.println("circle");
    }
}
