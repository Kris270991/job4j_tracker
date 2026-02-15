package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println(this.name + "'s food is " + this.food + ".");
    }

    public static void main(String[] args) {
        Cat catOne = new Cat();
        Cat catTwo = new Cat();
        catOne.giveNick("Gav");
        catOne.eat("cutlet");
        catOne.show();
        catTwo.giveNick("Black");
        catTwo.eat("fish");
        catTwo.show();
    }
}
