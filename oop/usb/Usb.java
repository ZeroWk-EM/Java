package oop.usb;

public class Usb {
    // Nome della chiavetta
    private String nome;
    // Memoria in gigabyte
    private double memory;
    // File presenti nella ChiavettaUSB
    private int files = 0;
    // Spazio occupato dai files
    private double memoryFill;

    public Usb(String nome, double memory) {
        this.nome = nome;
        this.memory = memory;
    }

    public void aggiungiFiles(int file, double memory) {
        files += file;
        memory = memory / 1024;
        this.memoryFill = this.memoryFill += memory;

        if (memory > this.memory) {
            System.out.println("Parametri errati");
        } else {
            System.out.println("File caricati [" + file + "]");
            System.out.println("File presenti nella chiavetta [" + files + "]");
            System.out.println("Spazio disponibile [" + (this.memory - this.memoryFill) + "]");
        }
    }

    public void rimuoviFiles(int file, double memory) {
        files -= file;
        memory = memory / 1024;
        this.memoryFill = (this.memoryFill -= memory);

        if (file >= files) {
            System.out.println("Parametri errati");
        } else {
            System.out.println("File rimosi [" + file + "]");
            System.out.println("File presenti nella chiavetta [" + files + "]");
            System.out.println("Spazio disponibile [" + (this.memory - this.memoryFill) + "]");
        }
    }

    public void visualizzaChiavettaUSB() {
        System.out.println("================================================");
        System.out.println("Nome chiavetta [" + nome + "]");
        System.out.println("Memoria [" + this.memory + "]");
        System.out.println("File presenti nella chiavetta [" + files + "]");
        System.out.println("Spazio occupato [" + memoryFill + "]");
        System.out.println("Spazio disponibile [" + (this.memory - memoryFill) + "]");
        System.out.println("================================================");

    }
}
