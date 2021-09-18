package com.blb.com.date;

import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date.toString());
//        long time = date.getTime();//时间撮
//        System.out.println(time);
//        Date date1 = new Date(time);
//        System.out.println(date1);
        String s = maxSubString("abcdd", "abcd");
        System.out.println(s);
    }
    public static String maxSubString(String str1,String str2)
    {
        String maxStr=(str1.length()>str1.length())?str1:str2;
        String minStr=(str1.length()<str1.length())?str1:str2;
        int len=minStr.length();
        for(int i=len;i>0;i--)
        {
            for(int x=0,y=x+i;y<len;x++,y++)
            {
                if(maxStr.contains(minStr.substring(x,y+1)))
                {
                    return minStr.substring(x,y+1);
                }
            }
        }
        return null;
    }
}
