package com.study.abstracts;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2019/3/6 5:31 PM
 */
public class Pro extends Employee{

    Pro(String name,String id,double pay){
        super(name,id,pay);
    }

    @Override
    public void work() {
        System.out.println("pro work");
    }
}
