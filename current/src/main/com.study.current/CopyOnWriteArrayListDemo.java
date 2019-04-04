import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-03-29 20:47
 */
public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) throws InterruptedException {
        List copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add("ananjunyu");
        copyOnWriteArrayList.add("cnanjunyu");
        copyOnWriteArrayList.add("bnanjunyu");
        copyOnWriteArrayList.add("dnanjunyu");
        Collections.sort(copyOnWriteArrayList);
        System.out.println(copyOnWriteArrayList);

        List list = new ArrayList();


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.add("nan" + i);
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.remove("nan" + i);
                }
            }
        });

        thread.start();
        //Thread.sleep(3000);
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //thread1.start();

    }
}
