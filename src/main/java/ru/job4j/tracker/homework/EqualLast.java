package ru.job4j.tracker.homework;

public class EqualLast {
    public static boolean check(int[] left, int[]right) {
       if (left[left.length -1 ] == right[right.length - 1]){
            return true;
        }
        return false; //Можно как-ито упростить код?
    }
}