package ru.job4j.tracker.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);

        Pioneer vasya = new Pioneer();
        Girl masha =  new Girl();
        Wolf seriy = new Wolf();
        masha.help(vasya);
        wolf.eat(masha);
        vasya.kill(seriy);
    }
}
