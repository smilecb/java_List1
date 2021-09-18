package com.blb.com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) throws ParseException {
      //实例化SimpleDataFormat使用默认的构造器
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        //格式化 日期--》字符串
        Date date = new Date();
        System.out.println(date);
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        //解析 格式化的逆过程 字符串--》日期
        String str="19-1-1 上午0:0";
        Date parse = simpleDateFormat.parse(str);
        System.out.println(parse);
        //使用带参的构造函数实现格式化
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        String format1 = simpleDateFormat1.format(date);
        System.out.println(format1);
    }
}
