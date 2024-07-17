package ru.job4j.tracker.oop;

public class HomeWork {
  public static double distance(int x1, int y1, int x2, int y2) {
      double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
      return result;
    }

    public static void main(String[] args) {
        System.out.println(HomeWork.distance(0,0,2,0));
    }
}
