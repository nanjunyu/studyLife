package com.stduy.threads;

/**
 * @Author Frank  wait();
 *                notify();
 *                notifyAll();
 *                都使用在同步中，因为要对持有监视器（锁）的线程操作。
 *                所有要使用在同步中，因为只有同步才具有锁。
 *   为什么这些操作线程的方法要定义在Object类中呢？
 *   因为这些方法在操作同步线程时，都必须要标识他们所操作线程只有锁，
 *   只有同一个锁上的被等待线程，可以被同一个锁上notify唤醒。
 *   不可以对不同锁上的线程进行唤醒。
 *
 *   也就是说，等待和唤醒必须是同一个锁。
 *
 *   而锁可以是任意对象，所以可以被任意对象调用的方法定义在Object类中。
 * @Date Create in  2019/3/15 15:12
 */
public class Test {
    public static void main(String[] args) {
        Res res = new Res();
        InputDemo inputDemo = new InputDemo(res);
        OutputDemo outputDemo = new OutputDemo(res);
        Thread inputThread = new Thread(inputDemo);
        Thread outPutThread = new Thread(outputDemo);
        inputThread.start();
        outPutThread.start();
    }
}
