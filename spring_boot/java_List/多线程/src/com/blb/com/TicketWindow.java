package com.blb.com;

public class TicketWindow extends Thread {

    /**总共100张票，几个窗口公用，所有声明为static**/
     private static int ticket= 100;
     private static Object obj=new Object();
    @Override
    public void run() {
            while (ticket > 0)//判断是否卖完
            {

                System.out.println(Thread.currentThread().getName() + "卖出了一张票" + ticket);
                ticket--;

        }
    }
}

class TextTicket{
    public static void main(String[] args) {
        /**创建3个线程**/
        TicketWindow t1 = new TicketWindow();
        TicketWindow t2 = new TicketWindow();
        TicketWindow t3 = new TicketWindow();
        /**给三个线程命名**/
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        /**启动**/
        t1.start();
        t2.start();
        t3.start();
    }
}
