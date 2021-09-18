package com.blb.com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 仇斌
 * @date 2021/7/9 0009 22:45
 */
public class demo1 {
    public static void main(String[] args) {
//        int[] a=new int[5];
//        System.out.println(a.length);
//        int b[]=new int[6];
//        System.out.println(b.length);
//        User[] users=new User[10];
//        System.out.println(users.length);
        int[][] a=new int[10][10];
        for(int i=0;i<10;i++)
        {
            a[i][0]=1;
            a[i][i]=1;
        }
        for(int i=2;i<=9;i++)
        {
            for(int j=1;j<i;j++)
            {
                a[i][j]=a[i-1][j]+a[i-1][j-1];
            }

        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
