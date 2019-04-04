package com.study.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-18 15:02
 */
public class ListDemo {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("nanjunyu");
        arrayList.add("xieyi");
        arrayList.add("wulongbao");
        arrayList.add("gaoyashu");
        arrayList.add("nanjunkai");
        arrayList.add("zhouhao");
        Collections.sort(arrayList);
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
