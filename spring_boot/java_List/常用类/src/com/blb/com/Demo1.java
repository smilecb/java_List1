package com.blb.com;

public class Demo1 {
    public static void main(String[] args) {
        //通过字面量的方式创建字符串 声明在方法区中字符串的常量池中
        String s1="a";
        String s2="a";
        //通过new——+构造器的方式创建 ，保存的是在堆空间中开辟空间以后对应的地址值
        String s3 = new String("a");
        String s4 = new String("b");
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//false
        System.out.println(s2==s3);//false
        System.out.println(s3==s4);//false
    }
}
