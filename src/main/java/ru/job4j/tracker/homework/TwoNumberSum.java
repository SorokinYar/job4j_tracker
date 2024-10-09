package ru.job4j.tracker.homework;

public class TwoNumberSum {
    public static int[] getIndex(int[] array, int target) {
        int[] result = new int[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    result = new int[]{i, j};// Нужен break?
                }
            }
        }
        return result;
    }
}
