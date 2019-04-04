import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: nanJunYu
 * @Description:
 * @Date: Create in  2018/9/3 15:48
 */
public class CallableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("我在执行一个漫长的任务，要3S");
                Thread.sleep(3000);
                return new Random().nextInt(1000);
            }
        };
        FutureTask<Integer> future = new FutureTask<Integer>(callable);
        future.run();
        //new Thread(future).start();
       // Thread.sleep(11000);
        if(future.isDone()){
            System.out.println("运行结束了");
            System.out.println(future.get());
        }else {
            System.out.println("还没执行结束***等等吧");
            //future.run();
        }

    }
}
