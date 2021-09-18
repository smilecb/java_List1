package com.blb;

/**
 * @author smilecb
 * @date 2021/9/16 0016 11:45
 */
public class People {
    private String name;

    private String age;

    public People() {
    }

    public People(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
