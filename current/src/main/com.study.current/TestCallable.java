import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: nanJunYu
 * @Description:
 * @Date: Create in  2018/9/3 15:19
 */
public class TestCallable {
    public static void main(String[] args) {
        CallableDemo cd = new CallableDemo();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(cd);
        new Thread(futureTask).start();
        int sum = 0;
        //接收运算结果
        try {
            sum = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("sum is " + sum);
    }
}
