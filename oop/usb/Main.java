package oop.usb;

public class Main {
    public static void main(String[] args) {
        Usb lexar = new Usb("Lexar", 32);

        lexar.aggiungiFiles(15, 231);
        System.out.println("----------");
        lexar.aggiungiFiles(3, 8);

        lexar.visualizzaChiavettaUSB();
        lexar.rimuoviFiles(8, 122);
        System.out.println("----------");

        lexar.aggiungiFiles(3, 12);
        lexar.visualizzaChiavettaUSB();

    }
}
