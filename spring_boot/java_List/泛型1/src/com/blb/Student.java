package com.blb;

/**
 * @author smilecb
 * @date 2021/9/16 0016 12:11
 */
public class Student extends People{
    private int id;

    public Student(int id) {
        this.id = id;
    }

    public Student(String name, String age, int id) {
        super(name, age);
        this.id = id;
    }
    public Student()
    {
        super();
    }

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
}
