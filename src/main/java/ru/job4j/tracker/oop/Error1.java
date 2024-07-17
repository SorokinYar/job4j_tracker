package ru.job4j.tracker.oop;

public class Error1 {

    private boolean active;
    private int status;
    private String message;

    public Error1() {

    }
    public Error1(boolean active, int status, String message){
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo(){
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error1 error1 = new Error1();
        error1.printInfo();
        Error1 error1WithInfo = new Error1(true,5, "Hi");
        error1WithInfo.printInfo();
    }
}
