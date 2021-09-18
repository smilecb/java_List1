package com.blb.com;

import java.util.concurrent.locks.ReentrantLock;

public class Lock1 extends  Thread{

    private static int tick=100;
    private static ReentrantLock lock=new ReentrantLock();

    @Override
    public void run() {
        while (true)
        {
            try {
                lock.lock();
                if (tick > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + tick);
                    tick--;
                } else
                    break;
            }
            finally {
                lock.unlock();
            }
            }

    }
}

class LockText1{
    public static void main(String[] args) {
        Lock1 lock1 = new Lock1();
        Lock1 lock2 = new Lock1();
        Lock1 lock3 = new Lock1();
        lock1.setName("窗口一");
        lock2.setName("窗口二");
        lock3.setName("窗口三");
        lock1.start();
        lock2.start();
        lock3.start();
    }
}