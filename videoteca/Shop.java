package videoteca;

import videoteca.prodotti.Prodotto;
import videoteca.prodotti.tech.*;
import videoteca.prodotti.media.*;

public class Shop {
    private int len;
    Prodotto[] listaprodotti;

    Shop(int len) {
        setLen(len);
        this.listaprodotti = new Prodotto[getLen()];
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getLen() {
        return len;
    }

    public void addProdotto(Prodotto oggetto) {
        for (int i = 0; i < listaprodotti.length; i++) {
            if (listaprodotti[i] == null) {
                listaprodotti[i] = oggetto;
                break;
            }
        }
    }

    public int getProduct() {
        int count = 0;
        for (int i = 0; i < listaprodotti.length; i++) {
            if (listaprodotti[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void shopState() {
        for (int i = 0; i < listaprodotti.length; i++) {
            System.out.println("\n" + listaprodotti[i]);
        }

    }

    public int phoneStatus() {
        int count = 0;
        for (int i = 0; i < listaprodotti.length; i++) {
            if (listaprodotti[i] instanceof Phone) {
                count++;
            }
        }
        return count;
    }

    public int tabletStatus() {
        int count = 0;
        for (int i = 0; i < listaprodotti.length; i++) {
            if (listaprodotti[i] instanceof Tablet) {
                count++;
            }
        }
        return count;
    }

    public int filmStatus() {
        int count = 0;
        for (int i = 0; i < listaprodotti.length; i++) {
            if (listaprodotti[i] instanceof Film) {
                count++;
            }
        }
        return count;
    }

    public int musicStatus() {
        int count = 0;
        for (int i = 0; i < listaprodotti.length; i++) {
            if (listaprodotti[i] instanceof Music) {
                count++;
            }
        }
        return count;
    }

    public int gameStatus() {
        int count = 0;
        for (int i = 0; i < listaprodotti.length; i++) {
            if (listaprodotti[i] instanceof Game) {
                count++;
            }
        }
        return count;
    }

}
