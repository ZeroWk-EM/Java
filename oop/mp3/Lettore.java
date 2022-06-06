package oop.mp3;

public class Lettore {
    // Memoria lettore MP3
    private int memory;
    // Potenza della batteria
    private double batteryCapacity;
    // Brani presenti
    private int songs = 0;
    // Livello Residuo batteria;
    private double batteryStatus;
    // Ore di ascolto
    private float listenTime = 0;

    public Lettore(int memory, double batteryCapacity) {
        this.memory = memory;
        this.batteryCapacity = batteryCapacity;
        this.batteryStatus = batteryCapacity;
    }

    public void caricaBrani(int addSong) {
        songs += addSong;
        System.out.println("Brani caricati [" + addSong + "]");
        System.out.println("Totale brani presenti nel lettore [" + songs + "]");

    }

    public void rimuovibrani(int removeSong) {
        if ((songs -= removeSong) < 0) {
            System.out.println("Parametri errati");
        } else {
            System.out.println("Brani rimossi [" + removeSong + "]");
            System.out.println("Totale brani presenti nel lettore [" + songs + "]");
        }
    }

    public void ascoltaBrani(float timeListen) {
        if (timeListen > batteryStatus) {
            System.out.println("Carica non sufficente");
        } else {
            this.batteryStatus -= timeListen;
            this.listenTime += timeListen;
        }

    }

    public void caricaBatteria() {
        this.batteryStatus = this.batteryCapacity;
        System.out.println("Ricarica completata");
    }

    public void visualizzaLettore() {
        System.out.println("================================");
        System.out.println("Dimensione memoria in GB [" + this.memory + "]");
        System.out.println("Potenza batteria in ore [" + this.batteryCapacity + "]");
        System.out.println("Numero dei brani prenseti nel lettore [" + this.songs + "]");
        System.out.println("Livello residuo batteria [" + this.batteryStatus + "]");
        System.out.println("Tempo totale di ascolto [" + this.listenTime + "]");
        System.out.println("================================");

    }
}
