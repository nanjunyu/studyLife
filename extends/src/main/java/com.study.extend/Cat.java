package com.study.extend;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019/3/7 4:10 PM
 */
public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouth(){
        System.out.println("会抓老鼠");
    }



}
