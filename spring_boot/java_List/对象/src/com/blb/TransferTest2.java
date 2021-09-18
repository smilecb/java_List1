package com.blb;

/**
 * @author 仇斌
 * @date 2021/7/18 0018 12:27
 */
public class TransferTest2 {
    public static void main(String[] args) {
        Integer integer = new Integer(33);
        int i = integer.intValue();
        int a=integer;
        System.out.println(i);
        String s = new String("1.23");
        float v = Float.parseFloat(s);
        System.out.println(v);
        String s1 = String.valueOf(v);
        System.out.println(s1);
    }
}
