package ru.job4j.tracker.oop;

public class Jukebox {
    public String music(int position) {
        String song;

        if (position == 1) {
             song = "Пусть бегут неуклюже";
        } else if ( position == 2) {
             song  = "Спокойной ночи";
        } else {
             song = "Песня не найдена";
        }
        return song;
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        System.out.println(jukebox.music(1));
        String result = jukebox.music(2);
        System.out.println(result);
    }
}
