package com.blb.com.compare;

import java.util.Arrays;
import java.util.Comparator;

public class Text2 {
    public static void main(String[] args) {
        Good1[] goods = new Good1[4];
        goods[0]=new Good1("a",23.6);
        goods[1]=new Good1("b",53.6);
        goods[2]=new Good1("c",37.7);
        goods[3]=new Good1("d",37.7);
        Arrays.sort(goods, new Comparator<Good1>() {
            @Override
            public int compare(Good1 o1, Good1 o2) {
                if(o1 instanceof Good1 && o2 instanceof Good1 )
                {
                    if(o1.getPiece()!=o2.getPiece())
                    {
                        return (int) (o1.getPiece()-o2.getPiece());
                    }
                    else return o1.getName().compareTo(o2.getName());
                }
                return 0;
            }
        });
        for(Good1 good1:goods)
        {
            System.out.println(good1);
        }
    }
}
