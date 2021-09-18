package com.blb;

/**
 * @author smilecb
 * @date 2021/9/16 0016 9:47
 */
public class Order<T> {
    private int id;

    private String name;

    //内部结构就可以使用类的泛型
    private T orderT;

    public Order() {
//        T[] arr=new T[10];

    }

    public Order(int id, String name, T orderT) {
        this.id = id;
        this.name = name;
        this.orderT = orderT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orderT=" + orderT +
                '}';
    }
}
