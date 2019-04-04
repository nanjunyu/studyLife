import java.util.concurrent.*;

/**
 * @Author: nanJunYu
 * @Description:
 * @Date: Create in  2018/9/3 16:08
 */
public class CallableAndFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);
        for (int i = 1; i < 5; i++) {
            final int taskId = i;
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return taskId;
                }
            });
        }

        for (int i=1;i<5;i++){
            System.out.println(completionService.take().get());
        }
    }
}
