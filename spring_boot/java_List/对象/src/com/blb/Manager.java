package com.blb;

/**
 * @author 仇斌
 * @date 2021/8/5 0005 17:54
 */
public class Manager extends Employee {

    private double bonus;

    @Override
    public void work() {
        System.out.println("我是公司的管理者");
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public static void main(String[] args) {
        Employee manager = new Manager("张三",1,10.1,1000.1);
        manager.work();
        System.out.println(manager);
      
    }
}
