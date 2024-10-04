package ru.job4j.tracker.homework;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0; // Почему сразу пишем эту строку? можно ли без 0?
        for (int row = 0; row < array.length; row++) { // Возможно ли использовать цикл For-each для двумерных массивов?
            for (int cell = 0; cell < array[row].length; cell++) {
                result = result + array[row][cell];
            }
        }
        return result;
    }
}
