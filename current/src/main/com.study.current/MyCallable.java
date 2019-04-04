import java.util.concurrent.Callable;

/**
 * @Author: nanJunYu
 * @Description:
 * @Date: Create in  2018/8/31 10:39
 */
public class MyCallable implements Callable<String> {
    private long waitTime;

    public MyCallable(long waitTime) {
        this.waitTime = waitTime;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        final String threadName=Thread.currentThread().getName();
        System.out.println("********"+threadName);
        return threadName;
    }
}
