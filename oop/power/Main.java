package oop.power;

public class Main {
    public static void main(String[] args) {
        Power pw = new Power(5);
        System.out.println("La potenza di [" + pw.showBase() + "] e [" + pw.pow() + "]");
        pw.change(10);
        System.out.println("La potenza di [" + pw.showBase() + "] e [" + pw.pow() + "]");
    }
}
