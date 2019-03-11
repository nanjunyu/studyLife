package com.study.extend;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019/3/7 4:10 PM
 */
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void kanjia(){
        System.out.println("会看家");
    }
}
