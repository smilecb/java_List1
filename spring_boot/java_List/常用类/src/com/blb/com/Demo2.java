package com.blb.com;

public class Demo2 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="word";
        String s3="hello"+"word";
        String s4="hello"+s2;
        String s5=s1+"word";
        String s6=s1+s2;
        System.out.println(s3==s4);//false
        System.out.println(s3==s5);//false
        System.out.println(s3==s6);//false
        System.out.println(s4==s5);//false
        System.out.println(s4==s6);//false
        System.out.println(s5==s6);//false
        System.out.println(s3==s6.intern());//true
    }
}
