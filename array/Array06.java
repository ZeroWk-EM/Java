package array;

import java.util.Scanner;

public class Array06 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("Inserisci la lunghezza dell'array ");
            int num = reader.nextInt();
            int[] array = new int[num];
            int[] finalarray = new int[num];

            // Riempimento
            for (int i = 0; i < array.length; i++) {
                System.out.print("Inserisci l'elemento [" + i + "] dell'array ");
                array[i] = reader.nextInt();
            }

            int j = 0; // NON CI AVEVO PENSATO GUARDATO SOLUZIONE

            // Controllo pari
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    finalarray[j] = array[i];
                    j++;
                }
            }

            // Controllo dispari
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    finalarray[j] = array[i];
                    j++;
                }
            }

            // STAMPA ARRAY
            for (int i = 0; i < array.length; i++) {
                System.out.print("[" + finalarray[i] + "]");
            }

        } finally {
            reader.close();
        }
    }
}
