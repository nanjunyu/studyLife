package com.stduy.threads;

/**
 * @Author Frank  wait();
 *                notify();
 *                notifyAll();
 *                ��ʹ����ͬ���У���ΪҪ�Գ��м��������������̲߳�����
 *                ����Ҫʹ����ͬ���У���Ϊֻ��ͬ���ž�������
 *   Ϊʲô��Щ�����̵߳ķ���Ҫ������Object�����أ�
 *   ��Ϊ��Щ�����ڲ���ͬ���߳�ʱ��������Ҫ��ʶ�����������߳�ֻ������
 *   ֻ��ͬһ�����ϵı��ȴ��̣߳����Ա�ͬһ������notify���ѡ�
 *   �����ԶԲ�ͬ���ϵ��߳̽��л��ѡ�
 *
 *   Ҳ����˵���ȴ��ͻ��ѱ�����ͬһ������
 *
 *   ��������������������Կ��Ա����������õķ���������Object���С�
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
