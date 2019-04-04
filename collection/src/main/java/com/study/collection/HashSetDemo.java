package com.study.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author Frank
 * @Description HashSet 元素是无序的 ，不允许重复
 *              数据结构是哈希表。线程是非同步的，。
 *              保证元素唯一性的原理: 判断元素的hashcode值是否相同。
 *              如果相同，还会判断元素的equals方法，是否为true。
 * @Date: Create in  2019-03-18 17:03
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add("nanjunyu");
        hashSet.add("xieyi");
        hashSet.add("wulongbao");
        hashSet.add("zhouhao");
        hashSet.add("wulongbao");
      Iterator iterator= hashSet.iterator();
      while(iterator.hasNext()){
          System.out.println(iterator.next());
      }
    }
}
