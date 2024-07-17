package ru.job4j.tracker.oop;

import java.util.SortedMap;

public class HomeWork1 {
    public static String decision ( int age) {
        String result = age >= 28 ? "Make 100000$ per yaer" : " Make 40000$ per year";
        return result;
    }

    public static void main(String[] args) {
        String result = HomeWork1.decision(28);
        System.out.println(result);

        System.out.println(HomeWork1.decision(27));
    }

}
