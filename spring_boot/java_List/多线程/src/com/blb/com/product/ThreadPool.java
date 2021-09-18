package com.blb.com.product;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class NumberThread implements Runnable{

    @Override
    public  void run() {
        for(int i=0;i<100;i++)
        {
            if(i%2==0)
            {
                System.out.println(Thread.currentThread().getName()+"-----"+i);
            }
        }
    }
}

public class ThreadPool {
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
        executorService.execute(new NumberThread());//适用于Runnable
        //关闭线程池
        executorService.shutdown();
    }
}
