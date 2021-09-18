package com.blb.com;

/**
 * @author 仇斌
 * @date 2021/7/12 0012 21:12
 */
public class demo2 {
    public static void main(String[] args) {
        int[] a =new int[10];
        int[] b=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=(int)(Math.random()*100);
        }
        int max=-1,min=200,avg=0,sum=0;
        for(int i=0;i<10;i++)
        {
            sum+=a[i];
            avg+=a[i];
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("最大值"+max);

        System.out.println("最小值"+min);

        System.out.println("总和"+sum);
        System.out.println("平均值"+(avg/10));
        for(int i=0;i<10;i++)
        {
            b[i]=a[9-i];
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
