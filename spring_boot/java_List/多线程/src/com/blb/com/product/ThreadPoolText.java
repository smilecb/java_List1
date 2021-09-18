package com.blb.com.product;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class Clerk1 {

    private int num=0;

    /**消费产品**/
    public synchronized void consumeProduct() {
        if(num>0)
        {
            System.out.println(Thread.currentThread().getName()+"消费第"+num+"个商品");
            num--;
            notify();
        }
        else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**生产产品**/
    public synchronized void producterProduct() {

        if(num<20)
        {
            num++;
            System.out.println(Thread.currentThread().getName()+"生产第"+num+"产品");
            notify();
        }
        else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer1 extends Thread{//生产者

    private Clerk1 clerk;

    public Producer1(Clerk1 clerk)
    {
        this.clerk=clerk;
    }

    @Override
    public void run() {
        System.out.println(getName()+"开始生产产品");
        while (true)
        {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.producterProduct();
        }
    }
}

class Consumer1 extends Thread{//消费者
    private Clerk1 clerk;

    public Consumer1(Clerk1 clerk)
    {
        this.clerk=clerk;
    }
    @Override
    public void run() {
        System.out.println(getName()+"开始生产产品");
        while (true)
        {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }

}

public class ThreadPoolText {
    public static void main(String[] args) {
        //提供指定数量的线程次
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor service1= (ThreadPoolExecutor)executorService;
        //设置线程池的属性
        //设置核心池的大小
        service1.setCorePoolSize(15);
        //设置最大线程数
        service1.setMaximumPoolSize(15);
        //执行指定的线程操作，需要提供实现Runnable接口或Callable接口实现类的对象
        Clerk1 clerk1 = new Clerk1();
        executorService.execute(new Consumer1(clerk1));//适用于Runnable
        executorService.execute(new Producer1(clerk1));
        //关闭线程池
        executorService.shutdown();
    }

}
