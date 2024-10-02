package ru.job4j.tracker.homework;

public class Turn {
    public static int[] reverse(int[]array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[0 + i];
            array[0 + i] = temp;
        }
        return array;
    }
}
