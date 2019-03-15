package com.study.error;

/**
 * @Author Frank
 * @Description 如何自定义异常呢？
 *          因为父类中已经把异常信息的操作都完成了。
 *          所以子类中只要在构造时，将异常信息传递给父类通过super语句。
 *          那么就可以直接通过getMessage方法获取自定义异常信息。
 *
 *          自定义异常:
 *          必须是自定义类继承Exception
 *     继承Exception原因:
 *      异常体系有一个特点，异常类和异常对象都需要被抛出。他们都具备可抛性
 *      这个可抛性是Throwable这个体系中独有特点。
 *
 *     只有这个体系中的类和对象才能被throw和throws操作。
 *
 *     throws和throw的区别
 *
 *     throws使用在函数上，throw使用在函数内
 * @Date Create in  2019/3/13 10:09 AM
 */
public class Demo {

    public static void main(String[] args) {
        try {
            Demo.jisuan(3,-8);
        } catch (FuShuException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e.getValue());
        }

        try {
            throw  new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }


    public static  int jisuan(int a,int b) throws FuShuException {
        if(b<0){
            throw new FuShuException("有除负数的情况",b);
        }

       return a/b;
    }
}

class FuShuException extends Exception {
    private int value;



    public FuShuException() {
        super();
    }

    public FuShuException(String message,int value) {
        super(message);
        this.value=value;
    }

    public int getValue(){
        return value;
    }
}


