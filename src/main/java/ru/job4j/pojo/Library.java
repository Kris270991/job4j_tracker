package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book bookOne = new Book("Мои машинки", 63);
        Book bookTwo = new Book("Красная шапочка", 7);
        Book bookThree = new Book("Clean code", 150);
        Book bookFour = new Book("Котенок Шмяк: уютные истории", 96);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCountOfPages());
        }

        System.out.println("Change the position of the books");
        Book newbook = books[0];
        books[0] = books[3];
        books[3] = newbook;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCountOfPages());
        }

        System.out.println("Shows only Clean Code");

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getCountOfPages());
            }
        }

    }
}
