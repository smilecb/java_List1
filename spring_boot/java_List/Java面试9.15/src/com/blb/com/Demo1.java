package com.blb.com;

/**
 * @author smilecb
 * @date 2021/9/15 0015 16:17
 */
public class Demo1 {


    public static void main(String[] args) {
       Thread t= new Thread(){
           @Override
           public void run() {
               pong();
           }
       };
//       t.run();
        t.start();
        System.out.println("png");
    }

    static void pong()
    {
        System.out.println("pong");
    }
}
