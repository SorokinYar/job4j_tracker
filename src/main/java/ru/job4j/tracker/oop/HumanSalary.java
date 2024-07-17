package ru.job4j.tracker.oop;

public class HumanSalary {
    private int salary;

    public HumanSalary(int salary) {
        this.salary = salary;
    }

    public String show() {
        return " is " + salary + "$";
    }

    public void exchange(HumanSalary winner) {
        winner.salary = this.salary + winner.salary;
        this.salary -= this.salary;
    }

    public static void main(String[] args) {
        HumanSalary misha = new HumanSalary(12000);
        HumanSalary kiril = new HumanSalary(5000);
        misha.exchange(kiril);
        kiril.exchange(misha);
        System.out.println("Salary Misha in march " + misha.show());
        System.out.println("Salary Kiril in march " + kiril.show());
    }
}
