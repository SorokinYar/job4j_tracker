package ru.job4j.tracker.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {

    }

    public void printInfo() {
        System.out.println("Много мониоров: " + multiMonitor);
        System.out.println("SSD " + ssd + "GB");
        System.out.println(" Модель  CPU " + cpu);
    }
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.printInfo();
    }

}
