package com.blb.com.compare;

import java.util.Arrays;

public class Text {
    public static void main(String[] args) {
        Good[] goods = new Good[4];
        goods[0]=new Good("a",23.6);
        goods[1]=new Good("b",53.6);
        goods[2]=new Good("c",37.7);
        goods[3]=new Good("d",3.4);
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
        for(Good good:goods)
        {
            System.out.println(good);
        }
    }
}
