import java.util.concurrent.Executor;

/**
 * @Author: nanJunYu
 * @Description: 为每个请求启动一个新线程的Executor
 * @Date: Create in  2018/8/30 16:25
 */
public class ThreadPerTaskExecutor implements Executor {
    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
}
