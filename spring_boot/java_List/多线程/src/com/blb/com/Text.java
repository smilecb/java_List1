package com.blb.com;

public class Text {
    public static void main(String[] args) throws InterruptedException {
        /**创建Thread类的子类对象**/
        Demo1 demo1 = new Demo1();
//        Demo2 demo2 = new Demo2();
        /**调用此对象的run方法**/
        demo1.setName("线程一");
        demo1.start();//启动当前线程 调用当前线程的run方法
//        demo2.setName("线程二");
//        demo2.start();
        for(int i=0;i<100;i+=2)
        {
            System.out.println(Thread.currentThread().getName()+i+Thread.currentThread().getPriority());
            if(i==20)
                demo1.join();
        }
    }
}
