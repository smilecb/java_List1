package com.blb.com;

import java.util.Scanner;

/**
 * @author 仇斌
 * @date 2021/7/12 0012 21:48
 */
public class demo3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] a=new int[10];
        for(int j=0;j<10;j++)
        {
            a[j]=(j+1)*10;
        }
        int l=0,r=a.length-1;
        System.out.println("请输入您要查找的值");
        int x=scanner.nextInt();
        Boolean ju=true;
        while (l<=r)
        {
            int index=(l+r)/2;
            if(x==a[index])
            {
                System.out.println("找到了"+index);
                ju=false;
                break;
            }
            if(x<a[index])
            {
                r=index-1;
            }
            if(x>a[index])
            {
                l=index+1;
            }
        }
        if(ju)
            System.out.println("不找意思值未找到");
    }
}
