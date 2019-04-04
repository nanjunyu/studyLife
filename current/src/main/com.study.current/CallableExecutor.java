import java.util.Random;
import java.util.concurrent.*;

/**
 * @Author: nanJunYu
 * @Description:
 * @Date: Create in  2018/9/3 14:58
 */
public class CallableExecutor {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Future<Integer> future=executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        });
        try {
            Thread.sleep(5000);
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
