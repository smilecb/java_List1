package com.blb.com;

public class Ticket33 implements Runnable {
    private  int ticket = 100;
    @Override
    public void run() {

        while (true) {

          show();

        }
    }
    public synchronized void show() //同步监视器:this
    {

            if(ticket>0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ticket);
                ticket--;
            }

    }
}
class Ticket33Text
{
    public static void main(String[] args) {
        Ticket33 ticket22 = new Ticket33();
        Thread thread1 = new Thread(ticket22);
        Thread thread2 = new Thread(ticket22);
        Thread thread3 = new Thread(ticket22);
        thread1.setName("项目一");
        thread2.setName("项目二");
        thread3.setName("项目三");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
