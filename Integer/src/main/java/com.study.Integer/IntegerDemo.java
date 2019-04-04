package com.study.Integer;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-18 11:05
 */
public class IntegerDemo {
    public static void main(String[] args) {
        Integer x=new Integer("123");
        Integer y=new Integer(123);
        System.out.println(x==y);
        System.out.println(x.equals(y));
    }
}
