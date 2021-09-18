package com.blb.com;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author smilecb
 * @date 2021/9/11 0011 10:36
 */
public class Demo1 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("11");//添加元素
        collection.add("22");
        collection.add("33");
        System.out.println(collection.size());//获取有效元素的个数
        System.out.println(collection.isEmpty());//是否为空
        System.out.println(collection.contains("11"));//是否包含某个元素
        collection.remove("11");//：通过元素的equals方法判断是否是要删除的那个元素。只会删除找到的第一个元素
        System.out.println("==========================");
        for(Object o:collection)
        {
            System.out.println(o);
        }
        String s = collection.toString();
        System.out.println(s);
        Object[] objects = collection.toArray();//转化为数组
        System.out.println("==================================");
        for(Object o:objects)
        {
            System.out.println(o);
        }
        System.out.println("========================");
        ArrayList<Object> objects1 = new ArrayList<>();
        objects1.add("22");
        collection.removeAll(objects1);//当前集合的差集
        for(Object o:collection)
        {
            System.out.println(o);
        }
        collection.add("22");
        System.out.println("=====================");
        boolean b = collection.retainAll(objects1);//获取两个集合的交集
//        System.out.println(b);
        for(Object o:collection)
        {
            System.out.println(o);
        }
        System.out.println(collection.equals(objects1));//判断两个集合是否相等

    }
}
