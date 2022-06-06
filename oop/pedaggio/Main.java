package oop.pedaggio;

public class Main {
    public static void main(String[] args) {
        // Casello autostradale
        Casello caselloA51 = new Casello();
        Casello caselloSP50 = new Casello();

        // Automezzi

        // Questi passeranno per il casello A51
        Truck tr01 = new Truck(5, 12500);
        Truck tr02 = new Truck(2, 5000);

        // Questi passerano per il casello SP50
        Truck tr03 = new Truck(6, 17000);

        // CASELLO A51
        caselloA51.calcolapeso(tr01);
        caselloA51.stampa();
        caselloA51.calcolapeso(tr02);
        caselloA51.stampa();

        // Stampa ricevuta di fine giornata A51
        caselloA51.ricevuta();

        // CASELLO SP50
        caselloSP50.calcolapeso(tr03);
        caselloSP50.stampa();

        // Stampa ricevuta di fine giornata SP50
        caselloSP50.ricevuta();
    }
}
