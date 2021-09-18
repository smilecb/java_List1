package com.blb.com.product;

public class Clerk {

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

class Producer extends Thread{//生产者

    private Clerk clerk;

    public Producer(Clerk clerk)
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

class Consumer extends Thread{//消费者
    private Clerk clerk;

    public Consumer(Clerk clerk)
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

class ClerkText{
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer consumer = new Consumer(clerk);
        producer.setName("生产者");
        consumer.setName("消费者");
        producer.start();
        consumer.start();
    }

}

