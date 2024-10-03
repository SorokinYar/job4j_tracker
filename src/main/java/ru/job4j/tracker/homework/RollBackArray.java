package ru.job4j.tracker.homework;

public class RollBackArray {
    public static int[] rollBack(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }

}
