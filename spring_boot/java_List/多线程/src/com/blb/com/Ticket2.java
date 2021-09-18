package com.blb.com;

public class Ticket2 extends Thread {
    private static int tick =1000;
    private static Object on=new Object();
    @Override
    public void run() {
        while (true) {

                synchronized (on) {
                    if(tick>0) {
                    System.out.println(Thread.currentThread().getName() + tick);
                    tick--;
                }
                    else
                        break;
            }

        }
    }
}
class Ticket2Text{
    public static void main(String[] args) {
        Ticket2 ticket21 = new Ticket2();
        Ticket2 ticket22 = new Ticket2();
        Ticket2 ticket23 = new Ticket2();
        ticket21.setName("窗口一");
        ticket22.setName("窗口二");
        ticket23.setName("窗口三");
        ticket21.start();
        ticket22.start();
        ticket23.start();
    }
}
