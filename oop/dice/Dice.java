package oop.dice;

import java.util.Random;

public class Dice {
    private int face;
    private int numb;
    private Random rand = new Random();

   public Dice(int face) {
        this.face = face;
    }

    int generateNumb() {
        numb = rand.nextInt(this.face) + 1;
        /**
         * rand.nextInt(face)+1 perché il metodo nextInt(n) della classe Random
         * restituisce numeri interi casuali da 0 a n-1. Aggiungendo 1 ottengo
         * i numeri da 1 a n (in questo caso da 1 a 6 come un dado!).
         */
        return numb;
    }
}
