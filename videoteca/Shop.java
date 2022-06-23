package videoteca;

import videoteca.prodotti.Prodotto;

public class Shop {
    Prodotto[] listaprodotti = new Prodotto[10];

    public void addProdotto(Prodotto oggetto) {
        for (int i = 0; i < listaprodotti.length; i++) {
            if (listaprodotti[i] == null) {
                listaprodotti[i] = oggetto;
                break;
            }
        }
    }

    public void shopState() {
        for (int i = 0; i < listaprodotti.length; i++) {
            System.out.println(listaprodotti[i]);
        }

    }
}
