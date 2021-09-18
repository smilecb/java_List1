package com.blb.com;

import java.util.Objects;

/**
 * @author smilecb
 * @date 2021/9/12 0012 11:22
 */
public class Person implements Comparable{
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof  Person)
        {
            Person p=(Person) o;
            if(this.getId()!=p.getId())
            {
                return this.getId()<p.id?1:-1;
            }
            else
            {
                return this.getName().compareTo(p.getName());
            }
        }
        return 0;
    }
}
