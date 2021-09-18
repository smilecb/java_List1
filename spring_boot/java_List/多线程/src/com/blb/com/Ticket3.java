package com.blb.com;

public class Ticket3 extends Thread {
    private static int tick =100;
    private static Object on=new Object();
    @Override
    public void run() {
        while (true) {
                show();
        }
    }
    public static synchronized void show() {

            if(tick>0) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + tick);
                tick--;
            }


    }
}
class Ticket3Text{
    public static void main(String[] args) {
        Ticket3 ticket31 = new Ticket3();
        Ticket3 ticket32 = new Ticket3();
        Ticket3 ticket33 = new Ticket3();
        ticket31.setName("窗口一");
        ticket32.setName("窗口二");
        ticket33.setName("窗口三");
        ticket31.start();
        ticket32.start();
        ticket33.start();
    }
}
