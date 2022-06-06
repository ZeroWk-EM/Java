package oop.fabbrica;

public class Main {
    public static void main(String[] args) {
        LineaProduzione l1 = new LineaProduzione("SS0", 70);
        l1.attivaLinea(3);
        l1.controllaProduzione(20, 3);
        l1.visualizzaLinea();
        l1.attivaLinea(5);
        l1.controllaProduzione(100, 8);
        l1.visualizzaLinea();

    }
}
