package com.blb.com;

public class Demo1 extends Thread{
    /**重写run方法**/
    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {
            if(i%2==0)
            {
                System.out.println(Thread.currentThread().getName()+i+Thread.currentThread().getPriority());
            }
            if(i==40)
            {
                this.yield();
            }
        }
    }

}
