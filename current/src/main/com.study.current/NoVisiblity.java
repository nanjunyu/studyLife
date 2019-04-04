/**
 * @Author: nanJunYu
 * @Description:
 * @Date: Create in  2018/8/28 17:31
 */
public class NoVisiblity {
    private static boolean ready;
    private static int number;
    private static class ReaderThread extends Thread{
        public void run(){

            while(!ready){
                Thread.yield();
                System.out.println(number);
            }
        }
    }

    public static void main(String [] args){
        new ReaderThread().start();
        number=42;
        ready=true;
    }
}
