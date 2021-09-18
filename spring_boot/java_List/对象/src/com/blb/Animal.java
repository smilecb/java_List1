package com.blb;

/**
 * @author 仇斌
 * @date 2021/8/6 0006 11:11
 */
public class Animal {

    private String name;

    class Bird{
        public void say()
        {
            System.out.println("我是一只小小鸟");
        }
    }
    static class Dog
    {
        public void Shot(){
            System.out.println("汪汪汪");
        }
    }

    public static void main(String[] args) {
        //静态的成员内部类
        Animal.Dog dog = new Animal.Dog();
        dog.Shot();

        //非静态的成员内部类
        Animal animal = new Animal();
        Animal.Bird bird = animal.new Bird();
        bird.say();


    }

}
