import java.util.concurrent.*;

/**
 * @Author: nanJunYu
 * @Description:
 * @Date: Create in  2018/9/3 17:15
 */
public class CompletionServiceDemo {
    private static ExecutorService executorService = Executors.newFixedThreadPool(100);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletionService<Long> completionService = new ExecutorCompletionService<Long>(executorService);
        final int gNum = 100000000 / 100;
        for (int i = 1; i <= 100; i++) {
            int start = (i - 1) * gNum + 1, end = i * gNum;
            completionService.submit(new Callable<Long>() {
                @Override
                public Long call() throws Exception {
                    Long sum = 0l;
                    for (int j = start; j <= end; j++) {
                        sum += j;
                    }
                    return sum;
                }
            });
        }

        Long result = 0l;
        for (int i = 0; i < 100; i++) {
            result += completionService.take().get();
        }
        System.out.println("the result is " + result);

    }
}
