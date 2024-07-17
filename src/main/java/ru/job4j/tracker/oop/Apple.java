package ru.job4j.tracker.oop;

public class Apple {
    private int fruit;

    public Apple(int fruit){
        this.fruit = fruit;
    }

    public String amount() {
        return "have " + fruit + " pieces";
    }

    public void exchange(Apple another){
        this.fruit = another.fruit + this.fruit;
        another.fruit -= another.fruit;
    }

    public static void main(String[] args) {
        Apple man = new Apple(4);
        Apple woman =  new Apple(7);
        man.exchange(woman);
        woman.exchange(man);
        System.out.println("Man " + man.amount());
        System.out.println("Woman " + woman.amount());
    }
}
