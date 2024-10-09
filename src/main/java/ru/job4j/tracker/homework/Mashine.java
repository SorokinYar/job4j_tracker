package ru.job4j.tracker.homework;

import java.util.Arrays;

public class Mashine {
    public static int[] change(int money, int prise) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int i = 0;
        int j = 0;
        int amount = money - prise;
        while (i < coins.length && amount >= coins[i]) {
            amount -= coins[i];
            result[j] = coins[i];
            j++;
            if (amount < coins[i]) {
                i++;
            }
        }
        return Arrays.copyOf(result, j);
    }

    public static void main(String[] args) {
        change(50, 35);
    }
}
