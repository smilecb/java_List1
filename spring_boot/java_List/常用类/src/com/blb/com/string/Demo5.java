package com.blb.com.string;

public class Demo5 {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("abcd");
        stringBuffer.append("12");
        System.out.println(stringBuffer);
        stringBuffer.delete(1,2);
        System.out.println(stringBuffer);
        stringBuffer.replace(0,1,"III");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.substring(3));
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.substring(2));

    }
}
