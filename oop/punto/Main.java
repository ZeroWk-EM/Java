package oop.punto;

public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto();
        Punto punto2 = new Punto(3, 4);
        System.out.println("Punto 1 " + punto1.getX() + " " + punto1.getY());
        System.out.println("Punto 2 " + punto2.getX() + " " + punto2.getY());

        punto1.trasla(1, 1);
        System.out.println("Punto 1 traslato " + punto1.getX() + " " + punto1.getY());

        punto2.trasla(1, 2);
        System.out.println("Punto 2 traslato" + punto2.getX() + " " + punto2.getY());

    }
}
