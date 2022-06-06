package oop.car;

public class Car {
    private float resa; // Litri-Chilometri
    private float carburante; // Carburante residuo

    Car(float resa) {
        this.resa = resa;
        carburante = 0;
    }

    public void drive(float x) {
        float nofuel = this.carburante = carburante - (x / this.resa);
        if (nofuel > 0)
            this.carburante = carburante - (x / this.resa);
        else
            System.out.println("Non hai abbastanza carburante");
    }

    public float getGas() {
        return this.carburante;
    }

    public void addGas(int x) {
        this.carburante = carburante + x;
    }
}
