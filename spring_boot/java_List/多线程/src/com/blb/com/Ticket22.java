package com.blb.com;

public class Ticket22 implements Runnable {
    private  int ticket = 100;

    private  Object object=new Object();

    @Override
    public void run() {

            while (true) {

                synchronized (object) {
                    if(ticket>0) {
                        System.out.println(Thread.currentThread().getName() + ticket);
                        ticket--;
                    }
                  else
                    break;
                }

        }
    }
}
class Ticket22Text
{
    public static void main(String[] args) {
        Ticket22 ticket22 = new Ticket22();
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