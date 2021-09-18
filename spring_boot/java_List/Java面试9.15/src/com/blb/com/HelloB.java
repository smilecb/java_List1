package com.blb.com;

/**
 * @author smilecb
 * @date 2021/9/15 0015 16:54
 */
public class HelloB extends HelloA {
    public HelloB(){
        System.out.println("HelloB");
    }
    {
        System.out.println("Im B Class");
    }
    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}
