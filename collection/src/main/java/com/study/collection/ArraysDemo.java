package com.study.collection;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Frank
 * @Description 把数组变成集合的好处，可以使用集合的思想和方法来操作数组中的元素。
 *              注意数组变成集合以后，不能使用集合的add 和remove方法。因为数组的长度是固定的，否则会发生
 *              java.lang.UnsupportedOperationException异常
 *
 *              如果数组中存的都是对象。那么转换成集合后，集合中的元素就是数组中的元素。
 *              如果数组中存的都是基本数据类型，那么转换成集合后，集合会将数组直接当成集合中的元素存在。
 *
 * @Date: Create in  2019-03-20 15:28
 */
public class ArraysDemo {
    public static void main(String[] args) {
        String [] a={"abc","cc","kk"};
       List<String> list=Arrays.asList(a);
        System.out.println(list);
        Integer [] b={2,4,5};
        List<Integer> list1=Arrays.asList(b);
        System.out.println(list1);
    }
}
