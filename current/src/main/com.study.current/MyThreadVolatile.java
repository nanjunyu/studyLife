/**
 * @Author: nanJunYu
 * @Description:
 * @Date: Create in  2018/8/29 13:46
 */
public class MyThreadVolatile  implements Runnable {
    private volatile boolean isStop = false;
    public void run() {
        while (!isStop) {
            System.out.println("do something");
        }
    }
    public void setStop() {
        isStop = true;
    }

    public static void main(String[] args) {
        MyThreadVolatile t1 = new MyThreadVolatile();
        Thread ta = new Thread(t1);
        ta.start();
    }

}
