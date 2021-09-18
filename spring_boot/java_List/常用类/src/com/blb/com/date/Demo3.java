package com.blb.com.date;

import java.util.Calendar;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        int year = instance.get(Calendar.YEAR);
        System.out.println(year);
        int month = instance.get(Calendar.MONTH);
        System.out.println(month);
        int day = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        instance.set(Calendar.DAY_OF_WEEK,1);
        int day1 = instance.get(Calendar.DAY_OF_WEEK);
        System.out.println(day1);
        Date time = instance.getTime();
        System.out.println(time);

    }
}
