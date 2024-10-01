package ru.job4j.tracker.oop;

public class FindEvenElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(" Четные элементы масссива: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(" Четные элементы масссива: ");
        for (int number : numbers1) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
