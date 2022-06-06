package oop.pedaggio;

public class Truck {
    private int assi;
    private double pesoTotale;

    public Truck(int assi, double pesoTotale) {
        this.assi = assi;
        this.pesoTotale = pesoTotale;
    }

    public int getAssi() {
        return this.assi;
    }

    public double getpesoTotale() {
        return this.pesoTotale;
    }
}
