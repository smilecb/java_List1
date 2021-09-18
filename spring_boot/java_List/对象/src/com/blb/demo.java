package com.blb;

/**
 * @author 仇斌
 * @date 2021/7/18 0018 12:13
 */
public class demo {

    public static void sun(Object... objects){
        for(Object object:objects)
        {
            System.out.println(object);
        }
    }


    public static void main(String[] args) {
//        demo.sun(1,2,true,"asewwaw");

        Student p=new Student();
        p.setAge(1);
        p.setName(1);
        p.setId(1);
        System.out.println(p.getId()+" "+p.getAge()+" "+p.getName());
    }
}
