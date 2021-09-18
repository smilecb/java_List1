package com.blb.com.string;

public class Demo3 {
    public static void main(String[] args) {
        String s="12345";
        char[] chars = s.toCharArray();
        for(char c:chars)
        {
            System.out.println(c);
        }
        String s1 = new String(chars);
        System.out.println(s1);
    }
}
