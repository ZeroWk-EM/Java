
package oop.centralino;

public class Main {
    public static void main(String[] args) {
        Centralino infotel = new Centralino("INFOTEL");
        System.out.println("====================");
        infotel.effettuaChiamata(3);
        System.out.println("====================");

        infotel.riceviChiamata(12);

        infotel.visualizzaCentralino();
        infotel.riceviChiamata(30);
        System.out.println("====================");

        infotel.effettuaChiamata(5);

        infotel.visualizzaCentralino();

    }
}
