package com.stduy.threads;

/**
 * @Author Frank
 * @Date Create in  2019/3/15 15:11
 */
public class InputDemo implements Runnable {

    public InputDemo(Res res) {
        this.res = res;
    }

    private Res res;

    @Override
    public void run() {
        int x = 0;
        while (true) {
            synchronized (res) {
                if (res.isFlag())
                    try {
                        res.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                if (x == 0) {
                    res.setName("nanjunyu");
                    res.setSex("ÄÐ");
                } else {
                    res.setName("gaoyashu");
                    res.setSex("Å®");
                }
                x = (x + 1) % 2;
                res.setFlag(true);
                res.notify();
            }

        }
    }
}
