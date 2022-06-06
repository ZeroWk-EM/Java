package oop.fabbrica;

public class LineaProduzione {

    // Nome della macchina
    private String name;
    // Produttivita ES = 30 pezzi/ora;
    private int productivity;
    // Pezzi prodotti
    private int makeItem = 0;
    // Pezzi scartati
    private int wasteItem = 0;
    // Totale pezzi prodotti
    private int totalItem = 0;
    // Pezzi controllati
    private int validateIteam = 0;

    public LineaProduzione(String nameLine, int productivityLine) {
        this.name = nameLine;
        this.productivity = productivityLine;
    }

    public void attivaLinea(int timeOn) {
        System.out.println("Linea [" + this.name + "] attivata");
        System.out.println("Tempo di esecuzione = [" + timeOn + "] ore");
        makeItem = this.productivity * timeOn;
        System.out.println("Pezzi prodotti [" + makeItem + "]");
        this.totalItem += makeItem;
        System.out.println("Pezzi Totali [" + totalItem + "]");
    }

    public void controllaProduzione(int checkItem, int deleteItem) {
        if (deleteItem > checkItem) {
            System.out.println("Parametri errati");
        } else {
            wasteItem += deleteItem;
            this.validateIteam += checkItem;
        }
    }

    public void visualizzaLinea() {
        System.out.println("==========================");
        System.out.println("Identificativo linea [" + this.name + "]");
        System.out.println("Produttivita in pezzi/ora [" + this.productivity + "]");
        System.out.println("Pezzi totali prodotti [" + this.totalItem + "]");
        System.out.println("Pezzi controllati [" + this.validateIteam + "]");
        System.out.println("Pezzi scartati [" + this.wasteItem + "]");
        System.out.println("==========================");

    }

}
