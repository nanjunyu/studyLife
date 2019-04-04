package com.stduy.threads;

/**
 * @Author Frank
 * @Date Create in  2019/3/15 15:11
 */
public class OutputDemo implements Runnable {
    private Res res;

    public OutputDemo(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (res) {
                if (!res.isFlag())
                    try {
                        res.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                System.out.println(res.getName() + "......." + res.getSex());
                res.setFlag(false);
                res.notify();
            }
        }
    }
}
