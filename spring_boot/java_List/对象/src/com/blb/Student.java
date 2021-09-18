package com.blb;

/**
 * @author 仇斌
 * @date 2021/7/30 0030 22:21
 */
public class Student extends Peo {
    private  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }

    public Student() {

    }

    public Student(int name, int age, int id) {
        super(name, age);
        this.id = id;
    }
}
