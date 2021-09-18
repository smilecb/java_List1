package com.blb.com;

import java.util.Objects;

/**
 * @author smilecb
 * @date 2021/9/11 0011 21:22
 */
public class People implements  Comparable{


    private String name;

    private int age;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public int compareTo(Object o) {
        if(o instanceof People)
        {
            People o1 = (People) o;
            if(this.getAge()!=o1.getAge())
            {
                return this.getAge()<o1.getAge()?1:-1;
            }
            else
            {
                return this.getName().compareTo(o1.getName());
            }
        }
        return 0;
    }
}
