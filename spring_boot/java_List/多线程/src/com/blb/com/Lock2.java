package com.blb.com;

import java.util.concurrent.locks.ReentrantLock;

public class Lock2 implements Runnable {
    private static int tick = 100;
    private static ReentrantLock lock=new ReentrantLock();

    @Override
    public void run() {
        while (true)
        {
            try {
                lock.lock();
                if(tick>0) {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + tick);
                    tick--;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
class Lock2Text{
    public static void main(String[] args) {
        Lock2 lock2 = new Lock2();
        Thread t1 = new Thread(lock2);
        Thread t2 = new Thread(lock2);
        Thread t3 = new Thread(lock2);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}