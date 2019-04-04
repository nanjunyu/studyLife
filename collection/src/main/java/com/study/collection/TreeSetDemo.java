package com.study.collection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author Frank
 * @Description  TreeSet  可以对set集合中数据自动排序。
 *              可以对set集合中的元素进行排序，底层数据结构是二叉树
 *              保证元素唯一性的依据:
 *              compareTo方法return 0。
 * @Date: Create in  2019-03-18 16:55
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSetDemo=new TreeSet();
        treeSetDemo.add(1);
        treeSetDemo.add(5);
        treeSetDemo.add(6);
        treeSetDemo.add(2);
        treeSetDemo.add(3);
        treeSetDemo.add(1);

        Iterator iterator= treeSetDemo.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
