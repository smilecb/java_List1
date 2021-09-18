package com.blb;

/**
 * @author 仇斌
 * @date 2021/7/30 0030 22:20
 */
public class Peo {
    private int name;
    private int age;

    public Peo() {
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Peo(int name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Peo{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
