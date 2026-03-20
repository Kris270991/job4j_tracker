package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item(1, "Kris");
        String result = item.toString();
        System.out.println(result);
    }
}
