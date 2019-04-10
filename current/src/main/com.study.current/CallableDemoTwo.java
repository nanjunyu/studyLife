import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-04-04 16:38
 */
public class CallableDemoTwo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 1000000000; i++) {
            sum += i;
        }
        return sum;
    }
}

class TestCallableTwo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableDemoTwo callableDemo=new CallableDemoTwo();
        FutureTask futureTask=new FutureTask(callableDemo);
        futureTask.run();
        System.out.println("等待运算完成....");
        System.out.println(futureTask.get());

    }

}
