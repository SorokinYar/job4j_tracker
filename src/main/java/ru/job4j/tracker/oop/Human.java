package ru.job4j.tracker.oop;

public class Human {
    private String name;
    private int age;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salary);
    }

    public static void main(String[] args) {
        Human man = new Human();
        man.setName("Kiril");
        man.setAge(21);
        man.setSalary(218000);
        man.show();
    }
}
