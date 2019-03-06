package com.study.abstracts;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2019/3/6 5:32 PM
 */
public class Test {
    public static void main(String[] args) {
        Pro pro=new Pro("nanjunyu","6666",300000);
        pro.work();
        Manager manager=new Manager("gaoyashu","666666",20000,300000);
        manager.work();
    }
}
