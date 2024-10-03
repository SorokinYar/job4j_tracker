package ru.job4j.tracker.homework;

public class ArrayChar {
    public static boolean starWith(char[] word, char[] prefix) {
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] != word[i]){
                return false;
            }
        }
        return true;
    }
}
