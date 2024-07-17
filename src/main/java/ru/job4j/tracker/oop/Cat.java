package ru.job4j.tracker.oop;

public class Cat {
    private String name;
    private String food;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }
    public static void main(String[] args) {
        Cat kot = new Cat();
        kot.giveNick("Murka");
        kot.eat("Pork");
        kot.show();
        Cat kisa = new Cat();
        kisa.giveNick("Nagaya");
        kisa.eat("Chiken");
        kisa.show();
    }
}
