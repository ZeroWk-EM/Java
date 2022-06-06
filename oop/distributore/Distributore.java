package oop.distributore;

public class Distributore {
    // Array dove sono contenuti i prezzi delle due bottiglie
    private double[] priceBottle = new double[2];
    // Array dove contenuta la quantita di bottiglie
    private int[] quantityBottle = new int[2];
    // Monete inserite dall'utente
    private double money = 0;
    private double resto = 0;

    public Distributore(double d, double e, int quantityBottle) {
        priceBottle[0] = d;
        priceBottle[1] = e;
        setQuantityBottle(quantityBottle);
    }

    // Setta la stessa quantita di bottiglie
    private void setQuantityBottle(int quantity) {
        this.quantityBottle[0] = quantity;
        this.quantityBottle[1] = quantity;
    }

    // Ricarica quantita diverse nel distributore
    public void ricaricaDistributore(int qu1, int qu2) {
        this.quantityBottle[0] += qu1;
        this.quantityBottle[0] += qu2;
        System.out.println("Ricarica effettuata");
        System.out.println("N. bottiglie bevande 1 = [" + this.quantityBottle[0] + "]");
        System.out.println("N. bottiglie bevande 2 = [" + this.quantityBottle[1] + "]");
    }

    public void inserisciMonete(double cash) {
        if (cash == 0.05 || cash == 0.10 || cash == 0.20 || cash == 0.50 || cash == 1.00) {
            money += cash;
            System.out.println("Il credito ammonta a [" + money + "]");
        }
    }

    public void scegliBevanda(int choice) {
        if (choice == 1) {
            if (money < priceBottle[0]) {
                System.out.println("Credito insufficiente");
                System.out.println("Inserisci altre monete");

            } else {
                System.out.println("Erogazione in corso...");
                quantityBottle[0]--;
                System.out.println("Preleva bevanda.");
                this.resto = money - priceBottle[0];
                System.out.println("Ritira il resto [" + resto + "]");

            }
        } else if (choice == 2) {
            if (money < priceBottle[1]) {
                System.out.println("Credito insufficiente");
                System.out.println("Inserisci altre monete");
            } else {
                System.out.println("Erogazione in corso...");
                quantityBottle[1]--;
                System.out.println("Preleva bevanda.");
                this.resto = money - priceBottle[1];
                System.out.println("Ritira il resto [" + resto + "]");
            }
        } else {
            System.out.println("Numero non valido");
        }
    }

    public void ritiraResto() {
        System.out.println("Resto ritirato [" +resto + "]");
        this.resto=0;
    }

    public void visualizzaStato() {
        System.out.println("=============================");
        System.out.println("Numero bottiglie bevanda 1 [" + quantityBottle[0] + "]");
        System.out.println("Costo bevanda 1 [" + priceBottle[0] + "]");
        System.out.println("Numero bottiglie bevanda 2 [" + quantityBottle[1] + "]");
        System.out.println("Costo bevanda 2 [" + priceBottle[1] + "]");
        System.out.println("Reto nel distributore [" + this.resto + "]");

        System.out.println("=============================");
    }
}
