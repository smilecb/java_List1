package com.blb.com;

/**1.创建一个实现Runnable接口的类**/
public class Demo3 implements Runnable {
    /**2.重写run方法**/
    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {
            if(i%2==0)
            {
                System.out.println(Thread.currentThread().getName()+i);
            }

        }
    }
}

class Demo3text
{
    public static void main(String[] args) {
       /**3.创建实现类的对象**/
        Demo3 demo3 = new Demo3();
        /**4.将Runnable接口的子类对象作为实际参数传递给Thread类的构造器中**/
        Thread t1 = new Thread(demo3);
        t1.setName("one");
        /**5.通过Thread类的对象调用start():1.启动线程2.调用当前线程的run--》调用了Runnable类型的target的run（）**/
        t1.start();
    }
}
