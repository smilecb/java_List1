package com.blb.com;

/**
 * @author 仇斌
 * @date 2021/7/9 0009 22:46
 */
public class User {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public User() {
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
