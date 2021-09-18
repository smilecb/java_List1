package com.blb;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author smilecb
 * @date 2021/9/13 0013 21:48
 */
public class Demo1 {

    @Test
    public void text1()
    {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        //类型不安全
//        arrayList.add("abd");
        for(Object o:arrayList)
        {
            //强转时可能报ClassCastException
            int i=(Integer)o;
            System.out.println(o);
        }
    }

    @Test
    public void text2()
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        //编译时会进行类型检查，保证数据的安全
//        arrayList.add("abd");
               for(Integer i:arrayList)
               {
                   //避免墙转操作
                   int x=i;
                   System.out.println(i);
               }
        System.out.println("=======================");
        Iterator<Integer> iterator = arrayList.iterator();
       while (iterator.hasNext())
       {
           System.out.println(iterator.next());
       }
    }
}
