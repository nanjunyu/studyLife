import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @Author: nanJunYu
 * @Description:
 * @Date: Create in  2018/8/30 16:10
 */
public class ExecutorTest {
    private static final int max = 100;
    private static final Executor exec = Executors.newFixedThreadPool(max);
    private static int i = 0;

    public static void main(String[] args) throws IOException {
        while (true) {
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    System.out.println(++i);
                }
            };
            exec.execute(task);
        }
    }
}
