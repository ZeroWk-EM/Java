package oop.mp3;

public class Main {
    public static void main(String[] args) {
        Lettore ipod = new Lettore(8,16);
        ipod.caricaBrani(30);
        ipod.ascoltaBrani(4);
        ipod.visualizzaLettore();
        ipod.rimuovibrani(8);
        ipod.ascoltaBrani(7);
        ipod.visualizzaLettore();

    }
}
