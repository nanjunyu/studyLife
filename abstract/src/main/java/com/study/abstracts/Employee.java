package com.study.abstracts;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2019/3/6 5:18 PM
 */
public abstract class Employee {
    private String name;
    private String id;
    private double pay;

    Employee(String name,String id,double pay){
        this.name=name;
        this.id=id;
        this.pay=pay;
    }

    public abstract void work();


}
