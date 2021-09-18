package com.blb;

/**
 * @author 仇斌
 * @date 2021/7/31 0031 21:02
 */
public class Order2 {

    //私有化构造器
    private Order2(){

    }

    //用一个静态变量指向当前类的实例
    private static Order2 instance=null;

    //公共的静态方法返回当前类的实例
    public static Order2 getOrder2()
    {
        if(instance == null)
        {
            return instance;
        }
        else
        {
            return new Order2();
        }
    }

//    public static void main(String[] args) {
//        Order2 order2 = Order2.getOrder2();
//        Order2 order21 = Order2.getOrder2();
//        System.out.println(order2==order21);
//    }


}


