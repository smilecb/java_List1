package com.blb.com;


import java.util.ArrayList;

public class Demo1 {

     private final  String reason;
     private final int day;

    private Demo1(String reason,int day)
    {
        this.day=day;
        this.reason=reason;
    }

    public static final Demo1 SPRING=new Demo1("春天",40);
    public static final Demo1 SUMMER=new Demo1("夏天",40);
    public static final Demo1 FULL=new Demo1("秋天",40);
    public static final Demo1 WINTER=new Demo1("冬天",40);

    @Override
    public String toString() {
        return "Demo1{" +
                "reason='" + reason + '\'' +
                ", day=" + day +
                '}';
    }

    public String getReason() {
        return reason;
    }

    public int getDay() {
        return day;
    }
}
class Text1{
    public static void main(String[] args) {
        Demo1 spring = Demo1.SPRING;
        System.out.println(spring);

    }
}
