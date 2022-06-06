package oop.pedaggio;

public class Casello {

    private int incassoTotale;
    private int totCamion;
    private int ricevuta;

    Casello() {
        this.incassoTotale = 0;
        this.totCamion = 0;
    }

    public void calcolapeso(Truck x) {
        int assi = x.getAssi();
        double peso = x.getpesoTotale();
        double tot = 5 * assi + 10 * (peso / 1000);

        System.out.println("Assi totali [" + assi + "]");
        System.out.println("Peso totale [" + peso + "]");
        System.out.println("Soldi dovuti [" + tot + "]");

        totCamion++;
        incassoTotale += tot;
        ricevuta++;
    }

    public void stampa() {
        System.out.println("== Ricevuta [" + ricevuta + "] ==");
        System.out.println("Camion passati [" + totCamion + "]");
        System.out.println("Incasso totale [" + incassoTotale + "]");
    }

    // Chiusura di cassa
    public void ricevuta() {
        System.out.println("==== CHIUSURA DI CASSA =====");
        stampa();

        // Una volta stampata la ricevuta di fine giornata si devono azzerare i dati
        totCamion = 0;
        incassoTotale = 0;
        ricevuta = 0;
    }

}
