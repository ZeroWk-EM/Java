package oop.scouteer;

public class Motorino {
    private String color;
    private int velocity = 0;
    private boolean isOn = false;
    private boolean alarm = true;

    // Costruttore
    public Motorino(String color) {
        setVerniciatura(color);
    }

    // Per cambiare il colore del motore
    public void setVerniciatura(String colour) {
        this.color = colour;
    }

    // Per visualizzare di che colore e il Motorino
    public String getVerniciatura() {
        return this.color;
    }

    // Per cambiare lo stato dell'altifurto
    public void switchAllarme(boolean condition) {
        this.alarm = condition;
    }

    // Per cambiare lo stato dell'accensione
    public void switchMotore(boolean condition) {
        this.isOn = condition;
    }

    // Per accelerare
    public void accelleraMotore(int x) {
        // Se l'allarme e attivo o il motere e spento
        if (this.alarm || isOn == false) {
            System.out.println("Impossibile accellerare ");
            statoMotore();
        } else {
            velocity += x;
            System.out.println("Velocita corrente [" + this.velocity + "] Km/h");
        }
    }

    private void statoMotore() {
        System.out.println("========== Stato Mototre ==========");
        if (this.alarm) {
            System.out.println("Allarme attivo");
        }
        if (this.isOn == false) {
            System.out.println("Motore Spento");
        } else if (this.isOn == false && this.alarm) {
            System.out.println("Motore Spento");
            System.out.println("Allarme attivo");
        }
        System.out.println("===================================");
    }
}
