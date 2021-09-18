package com.blb.com;

/**
 * @author smilecb
 * @date 2021/9/15 0015 18:17
 */
public class Demo2 extends Thread{
    @Override
    public void run() {
        System.out.println("demo2");
    }
    public static int getValue(int i)
    {
        int result=0;
        switch (i)
        {
            case 1:
                result=result+1;
            case 2:
                result=result+i*2;
            case 3:
                result=result+i*3;
        }
        return result;
    }

    public static void main(String[] args) {
     int a=0;
     int b=0;
     int c=0;
     int d=0;
    }
}

