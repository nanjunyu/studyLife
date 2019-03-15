package com.study.sclass;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019/3/11 4:35 PM
 */
public class InnerClass4Test {


    public static void main(String[] args) {
        Test.function().method();
    }
}

class Test {
    /*static class Inner implements Inter {

        @Override
        public void method() {
            System.out.println("method run");
        }

        static Inter function() {
            return new Inner();
        }
    }*/
    static Inter function(){
       return new Inter(){

           @Override
           public void method() {
               System.out.println("method run");
           }
       };
    }


}

interface Inter {
    void method();
}
