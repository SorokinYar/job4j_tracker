package ru.job4j.tracker.homework;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println( "Значение ячейки " + i + " равно " + numbers[i]);
        }
    }
}
