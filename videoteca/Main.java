package videoteca;

import videoteca.prodotti.tech.*;
import videoteca.prodotti.media.*;

public class Main {
    public static void main(String[] args) {

        Shop unieuro = new Shop(8);
        Shop euronic = new Shop(3);

        System.out.println("Numero massimo di oggetti UNIEURO[" + unieuro.getLen() + "]");
        System.out.println("Numero massimo di oggetti EURONICS[" + euronic.getLen() + "]");

        Device iphone12 = new Phone(129, "Apple", "Iphone 12", "LPDIW304L4", 2019, "IOS 14", 750.00, true, false);
        Device iphone13 = new Phone(248, "Apple", "Iphone 13", "SSDIWOQ224", 2021, "IOS 15", 845.50, false, false);
        Device iphone17 = new Phone(248, "Apple", "Iphone 17", "SSDIWOQ224", 2021, "IOS 15", 845.50, false, true);

        Device ipad = new Tablet(924, "Apple", "Ipad 10.2", "SLLMN4MNJ89", 2022, "IPADOS 15", 500.0, false);
        Device ipdaPro = new Tablet(324, "Apple", "Ipad PRO", "SSP234MNSJ", 2020, "IPADOS 15", 1000.0, true);

        Media uncharched = new Game(213, "Uncharted: collector edition", "Adventure", 2017, true, 40);
        Media jbond = new Film(532, "007 Casino Royale", "action", 120, 2006, 13.00);
        Media imdragon = new Music(997, "Beliver", "POP", "Image Dragon", 10, 2016, 10);

        unieuro.addProdotto(iphone12);
        unieuro.addProdotto(iphone13);
        euronic.addProdotto(iphone17);
        euronic.addProdotto(ipad);
        unieuro.addProdotto(ipdaPro);

        unieuro.addProdotto(uncharched);
        unieuro.addProdotto(jbond);
        unieuro.addProdotto(imdragon);

        unieuro.shopState();

        System.out.println("\nOggetti totali in inventario [" + unieuro.getProduct() + "]");

        System.out.println("Numero di telefoni [" + unieuro.phoneStatus() + "]");
        System.out.println("Numero di tablet [" + unieuro.tabletStatus() + "]");
        System.out.println("Numero di giochi [" + unieuro.gameStatus() + "]");
        System.out.println("Numero di film [" + unieuro.filmStatus() + "]");
        System.out.println("Numero di cd musicali [" + unieuro.musicStatus() + "]");

        euronic.shopState();
        System.out.println("\nOggetti totali in inventario [" + euronic.getProduct() + "]");

        System.out.println("Numero di telefoni [" + euronic.phoneStatus() + "]");
        System.out.println("Numero di tablet [" + euronic.tabletStatus() + "]");
        System.out.println("Numero di giochi [" + euronic.gameStatus() + "]");
        System.out.println("Numero di film [" + euronic.filmStatus() + "]");
        System.out.println("Numero di cd musicali [" + euronic.musicStatus() + "]");
    }
}