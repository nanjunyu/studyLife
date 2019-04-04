package com.study.map;

import java.util.*;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-19 20:29
 */
public class MapTest {
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap=new TreeMap<Student,String>(new StuNameComparator());
        treeMap.put(new Student("ananjunyu",26),"shangsha");
        treeMap.put(new Student("dgaoyashu",26),"shangsha");
        treeMap.put(new Student("cwulongbao",27),"baoao");
        treeMap.put(new Student("enanjunkai",24),"daxin");
        treeMap.put(new Student("bxieyi",29),"shanghai");

        Set<Map.Entry<Student,String>> entrySet= treeMap.entrySet();
        Iterator<Map.Entry<Student,String>>  studentIterator= entrySet.iterator();
        while (studentIterator.hasNext()){
           // System.out.println(studentIterator.next());
            Map.Entry<Student,String> me=studentIterator.next();
            Student student=me.getKey();
            String address=me.getValue();
            System.out.println(student);
            System.out.println(address);
        }
    }
}

class StuNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int num = o1.getName().compareTo(o2.getName());
        if (num == 0) {
            return new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
        }
        return num;
    }
}

