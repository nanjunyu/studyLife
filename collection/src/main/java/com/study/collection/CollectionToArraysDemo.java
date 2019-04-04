package com.study.collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author Frank
 * @Description 将集合转换成数组
 *              当指定类型的数组长度小于集合的size，那么方法内部会创建一个新的数组,长度为集合的size
 *              当指定类型的数组长度大于集合的size，那么就不会创建新的数组，而是使用传递进来的数组。
 *
 *
 *              为什么要将集合变成数组？
 *              为了限定对元素的操作。
 * @Date: Create in  2019-03-20 15:42
 */
public class CollectionToArraysDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("nanjunyu");
        arrayList.add("qixiaoliang");
        arrayList.add("cjb");
        String [] a= arrayList.toArray(new String [5]);
        String [] b= arrayList.toArray(new String [arrayList.size()]);
        System.out.println(Arrays.toString(b));
    }
}
