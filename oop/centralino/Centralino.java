package oop.centralino;

public class Centralino {
    // Nome del centralino
    private String name;
    // Chiamate ricevute
    private int callIn = 0;
    // Durate chiamate ricevute
    private double callInTime = 0.0;
    // Chiamate effetuate
    private int callOut = 0;
    // Durate chiamate effetuate
    private double callOuTime = 0.0;

    public Centralino(String name) {
        this.name = name;
    }

    public void riceviChiamata(double durata) {
        System.out.println("Ricevuta chiamata.");
        System.out.println("Durata chiamata [" + durata + "]");
        callIn++;
        System.out.println("Totale chiamate rivecute [" + callIn + "]");
        callInTime += durata;
    }

    public void effettuaChiamata(double durata) {
        System.out.println("Effettuata chiamata.");
        System.out.println("Durata chiamata [" + durata + "]");
        callOut++;
        System.out.println("Totale chiamate effetuate [" + callOut + "]");
        callOuTime += durata;

    }

    public void visualizzaCentralino() {
        System.out.println("*******************************************");
        System.out.println("Nome centralino [" + this.name + "]");
        System.out.println("Totale chiamate ricevute [" + callIn + "]");
        System.out.println("Durate chiamate ricevute [" + callInTime + "]");
        System.out.println("Totale chiamate effetuate [" + callOut + "]");
        System.out.println("Durata chiamate effettuate [" + callOuTime + "]");
        System.out.println("*******************************************");

    }
}
