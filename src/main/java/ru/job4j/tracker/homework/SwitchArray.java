package ru.job4j.tracker.homework;

public class SwitchArray {
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length -1] = temp;
        return array;
    }

    public static int[] swap(int[] array, int source, int destination){
        int temp = array[source];
        array[source]= array[destination];
        array[destination] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] result = swapBorder(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
