package com.blb;

import java.util.Objects;

/**
 * @author 仇斌
 * @date 2021/7/18 0018 12:26
 */
public class DataSwap {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DataSwap(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public DataSwap() {
    }

 
}
