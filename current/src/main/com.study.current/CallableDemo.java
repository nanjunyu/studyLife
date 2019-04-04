import java.util.concurrent.Callable;

/**
 * @Author: nanJunYu
 * @Description:
 * @Date: Create in  2018/9/3 15:16
 */
public class CallableDemo implements Callable<Integer> {
    /**
     * @Author: nanJunYu
     * @Description:计算1-100的和
     * @Date: Create in  2018/9/3 15:16
     * @params:
     * @return:
     */
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum += i;
        }
        System.out.println("sum:" + sum);
        return sum;
    }
}
