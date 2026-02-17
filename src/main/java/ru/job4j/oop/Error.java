package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error errorOne = new Error(true, 404, "Not found");
        errorOne.printInfo();
        Error errorTwo = new Error(false, 501, "Not Implemented");
        errorTwo.printInfo();
        Error errorThree = new Error(true, 403, "Forbidden");
        errorThree.printInfo();
        Error emptyError = new Error();
        emptyError.printInfo();
    }
}
