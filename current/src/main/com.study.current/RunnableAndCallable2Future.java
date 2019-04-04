import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Author: nanJunYu
 * @Description:
 * @Date: Create in  2018/9/3 10:43
 */
public class RunnableAndCallable2Future {
    public static void main(String[] args){
        FutureTask<Integer> task=new FutureTask<Integer>( (Callable<Integer>)//FutuereTask类是Future接口的一个实现类
                ()->{
                    int i=0;
                    for(;i<100;++i){
                        System.out.println(Thread.currentThread().getName()+"  "+i);
                    }
                    return i;
                });
        for(int i=0;i<100;++i){
            System.out.println(Thread.currentThread().getName()+"-----------"+i);//

            if(i==20){
                new Thread(task,"有返回值的线程").start();
            }
        }
        try{
            System.out.println("子线程的返回值"+task.get());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
