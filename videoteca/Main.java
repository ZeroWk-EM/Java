package videoteca;

import videoteca.prodotti.tech.*;
import videoteca.prodotti.media.*;

public class Main {
    public static void main(String[] args) {

        Shop unieuro = new Shop();

        Device iphone13 = new Phone(002, "Apple", "Iphone 13", "SSDIWOQ2245", 2021, "IOS 15", 845.50);
        Media jbond = new Film(532, "007 Casino Royale", "action", 120, 2006, 13.00);
        Device iphone12 = new Phone(002, "Apple", "Iphone 12", "SSDIWOQ2245", 2021, "IOS 15", 845.50);

        unieuro.addProdotto(iphone13);
        unieuro.addProdotto(jbond);
        unieuro.addProdotto(iphone12);

        unieuro.shopState();
    }
}