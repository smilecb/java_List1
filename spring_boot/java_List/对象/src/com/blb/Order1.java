package com.blb;

/**
 * @author 仇斌
 * @date 2021/7/31 0031 20:54
 */
public class Order1 {
    //私有化构造器
    private Order1(){

    }
    //提供当前类的实例且必须静态化
    private static Order1 instance=new Order1();

    //提供公共一个静态方法，返回当前类的实例
    public static Order1 getOrder1()
    {
        return instance;
    }

    //提供一个公共的静态方法来返回当前类的对象
    public static void main(String[] args) {
        Order1 order1 = Order1.getOrder1();
        Order1 order11 = Order1.getOrder1();
        System.out.println(order1==order11);
    }
}
