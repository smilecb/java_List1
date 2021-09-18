package com.blb.com;

import java.lang.reflect.Array;

import static java.util.Arrays.*;

/**
 * @author 仇斌
 * @date 2021/7/13 0013 20:25
 */
public class demo5 {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5};
        int[] b=new int[]{1,2,3,4,5};
       for(int x:a)
       {
           System.out.print(x);
       }
        System.out.println(" ");
        boolean equals = a.equals(b);
        System.out.println(equals);
        fill(a,0);
        for(int x:a)
        {
            System.out.print(x);
        }
        System.out.println(" ");
        sort(a);
        System.out.println(a);
        int i = binarySearch(a, 3);
        System.out.println(i);
    }
}
