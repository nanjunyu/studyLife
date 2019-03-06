package com.study.abstracts;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2019/3/6 5:22 PM
 */
public  class Manager extends Employee {

    private int bonus;

    Manager(String name, String id, double pay,int bonus) {
        super(name, id, pay);
        this.bonus=bonus;
    }

    @Override
    public void work() {
        System.out.println(" Manager work");
    }
}
