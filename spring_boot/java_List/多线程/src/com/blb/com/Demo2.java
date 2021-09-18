package com.blb.com;

public class Demo2 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i+=2)
        {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
