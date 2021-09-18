package com.blb.com;

public class TicketW implements Runnable{
    private  int ticket = 100;
    Object obj=new Object();
    @Override
    public void run() {
           while (true)
           {
               if(ticket>0)
               {
                   System.out.println(Thread.currentThread().getName()+ticket);
                   ticket--;
               }
           }

    }
}
class TicketWText{
    public static void main(String[] args) {
        TicketW ticketW = new TicketW();
        Thread t1 = new Thread(ticketW);
        Thread t2 = new Thread(ticketW);
        Thread t3 = new Thread(ticketW);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();


    }
}
