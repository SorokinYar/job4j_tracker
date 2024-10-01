package ru.job4j.tracker.homework;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println( "Размер масссива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prises = new float[40];
        System.out.println("Размер массива равен: " + prises.length);


        String[] names = new String[4];
        names[0] = "Petr";
        System.out.println(names[0]);
        names[1] = "Kirill";
        System.out.println(names[1]);
        names[2] = "Misha";
        System.out.println(names[2]);
        names[3] = "Pavel";
        System.out.println(names[3]);
    }
}
