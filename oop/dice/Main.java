package oop.dice;

public class Main {
    public static void main(String[] args) {
        Dice d4 = new Dice(4);
        Dice d6 = new Dice(6);
        Dice d8 = new Dice(8);
        Dice d10 = new Dice(10);
        Dice d12 = new Dice(12);
        Dice d20 = new Dice(20);

        System.out.println("Dado da quattro faccie = [" + d4.generateNumb() + "]");
        System.out.println("Dado da sei faccie = [" + d6.generateNumb() + "]");
        System.out.println("Dado da otto faccie = [" + d8.generateNumb() + "]");
        System.out.println("Dado da dieci faccie = [" + d10.generateNumb() + "]");
        System.out.println("Dado da dodici faccie = [" + d12.generateNumb() + "]");
        System.out.println("Dado da venti faccie = [" + d20.generateNumb() + "]");

    }

}
