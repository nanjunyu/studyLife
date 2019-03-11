package com.study.object;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019/3/8 3:40 PM
 */
public class ObjectDemo {

    public static void main(String[] args) {
        Demo demo = new Demo(2);
        Demo demo2 = new Demo(2);
        Demo demo3 = demo;
        Person person=new Person();
        System.out.println(demo.equals(demo2));
        System.out.println(demo.equals(demo3));
        System.out.println(demo.equals(person));
        System.out.println(demo.toString());
        System.out.println(Integer.toHexString(demo.hashCode()));
    }


}

class Person{


}

class Demo {
    private int num;

    Demo(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Demo)) {
            return false;
        }
        Demo demo = (Demo) object;

        return this.num == demo.num;
    }
}
