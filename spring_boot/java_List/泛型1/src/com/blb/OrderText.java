package com.blb;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author smilecb
 * @date 2021/9/16 0016 9:48
 */
public class OrderText {
    @Test
    public void text1()
    {
        //如果定义泛型，实例化没有指明类的泛型，则默认类的泛型为Object
        Order order = new Order();
        order.setOrderT(1);
        System.out.println(order.getOrderT());
        //建议实例化是指明类的泛型
        Order<String> order1 = new Order<>();
        order1.setOrderT("1");
        System.out.println(order1.getOrderT());
    }

    @Test
    public void text2()
    {
        Order2 order2 = new Order2();//由于子类在继承带泛型的父类时，指明了泛型的类型，则在实例化子类对象时，不在需要指明泛型
        order2.setOrderT(1);

        Order1<Integer> order1 = new Order1<>();
        order1.setOrderT(1);

    }

    @Test
    public void text3()
    {
        Text text = new Text();
        Integer[] a=new Integer[]{1,2,3,4};
        List<Integer> copy = text.copy(a);
        System.out.println(copy);

    }

    @Test
    public void text4()
    {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<?> arrayList3 = new ArrayList<>();
        arrayList3=arrayList1;
        arrayList3=arrayList2;
    }

    @Test
    public void text5()
    {
        List<? extends People> students=null;
        List<? super People> students1=null;
        ArrayList<People> list1 = new ArrayList<>();
        ArrayList<Student> list2 = new ArrayList<>();
        ArrayList<Object> list3 = new ArrayList<>();
        students=list1;
        students=list2;
        //编译不通过
//        students=list3;

        students1=list1;
        //编译不通过
//        students1=list2;
        students1=list3;

        //读数据
        students=list2;
        People people = students.get(0);
        //编译不通过
//        Student s = students.get(0);
        //写数据
        //编译不通过
//        students.add(new People());

        students1=list1;
        //读数据
        Object object = students1.get(0);
        //编译不通过
//        People object1 = students1.get(0);
        //写数据
        boolean add = students1.add(new People());
        boolean add1 = students1.add(new Student());
    }
}
