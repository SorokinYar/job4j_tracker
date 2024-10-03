package ru.job4j.tracker.homework;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[0]) {
                min = array[i];
            }
        }
        return min;
    }
}
