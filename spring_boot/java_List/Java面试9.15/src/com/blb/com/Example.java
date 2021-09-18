package com.blb.com;

/**
 * @author smilecb
 * @date 2021/9/15 0015 16:34
 */
public class Example {

    String str=new String("good");
    char c[]={'a','b','c'};
    public void exchage(String str,char chr[])
    {
        str="text ok";
        chr[0]='g';
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.exchage(example.str,example.c);
        System.out.println(example.str);
        System.out.println(example.c);
    }
}
